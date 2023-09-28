package com.ecommerce.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.exception.ProductException;
import com.ecommerce.model.Product;
import com.ecommerce.model.Rating;
import com.ecommerce.model.User;
import com.ecommerce.repository.RatingRepository;
import com.ecommerce.request.RatingRequest;
import com.ecommerce.service.ProductService;
import com.ecommerce.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;
    private ProductService productService;

    public RatingServiceImpl(RatingRepository ratingRepository, ProductService productService) {
        this.ratingRepository = ratingRepository;
        this.productService = productService;
    }

    @Override
    public Rating createRating(RatingRequest req, User user) throws ProductException {
        // TODO Auto-generated method stub

        Product product = productService.findProductById(req.getProductId());

        Rating rating = new Rating();
        rating.setProduct(product);
        rating.setUser(user);
        rating.setRating(req.getRating());
        rating.setCreatedAt(LocalDateTime.now());

        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getProductRatings(Long productId) {
        // TODO Auto-generated method stub
        return ratingRepository.getAllProducRatings(productId);
    }

}
