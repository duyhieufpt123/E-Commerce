package com.ecommerce.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.exception.CartItemException;
import com.ecommerce.exception.UserException;
import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Product;
import com.ecommerce.model.User;
import com.ecommerce.repository.CartItemRepository;
import com.ecommerce.repository.CartRepository;
import com.ecommerce.service.CartItemService;
import com.ecommerce.service.UserService;

@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;
    private UserService userService;
    private CartRepository cartRepository;

    public CartItemServiceImpl(CartItemRepository cartItemRepository, UserService userService,
            CartRepository cartRepository) {
        this.cartItemRepository = cartItemRepository;
        this.userService = userService;
        this.cartRepository = cartRepository;
    }

    @Override
    public CartItem createCartItem(CartItem cartItems) {

        cartItems.setQuantity(1);
        cartItems.setPrice(cartItems.getProduct().getPrice() *
                cartItems.getQuantity());
        cartItems.setDiscountedPrice(cartItems.getProduct().getDiscountedPrice());

        CartItem createdCartItem = cartItemRepository.save(cartItems);
        return createdCartItem;
    }

    @Override
    public CartItem updateCartItem(Long userId, Long id, CartItem cartItem)
            throws CartItemException, UserException {

        CartItem item = findCartItemById(id);
        User user = userService.findUserById(item.getUserId());

        if (user.getId().equals(userId)) {
            item.setQuantity(cartItem.getQuantity());
            item.setPrice(item.getQuantity() * item.getProduct().getPrice());
            item.setDiscountedPrice(item.getProduct().getDiscountedPrice() *
                    item.getQuantity());
        }
        return cartItemRepository.save(item);

    }

    @Override
    public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId) {

        CartItem cartItem = cartItemRepository.isCartItemExist(cart, product, size,
                userId);
        return cartItem;

    }

    @Override
    public void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException {

        CartItem cartItem = findCartItemById(cartItemId);

        User user = userService.findUserById(cartItem.getUserId());

        User reqUser = userService.findUserById(userId);

        if (user.getId().equals(reqUser.getId())) {
            cartItemRepository.deleteById(cartItemId);
        } else {
            throw new UserException("You can't remove another users item");
        }

    }

    @Override
    public CartItem findCartItemById(Long cartItemId) throws CartItemException {
        // TODO Auto-generated method stub
        Optional<CartItem> opt = cartItemRepository.findById(cartItemId);

        if (opt.isPresent()) {
            return opt.get();
        }

        throw new CartItemException("Cart Item is not found with id:" + cartItemId);
    }

}
