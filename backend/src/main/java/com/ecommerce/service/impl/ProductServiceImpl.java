package com.ecommerce.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ecommerce.exception.ProductException;
import com.ecommerce.model.Category;
import com.ecommerce.model.Product;
import com.ecommerce.repository.CategoryRepository;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.request.CreateProductRequest;
import com.ecommerce.service.ProductService;
import com.ecommerce.service.UserService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    private UserService userService;
    private CategoryRepository categoryRepository;

    public ProductServiceImpl(ProductRepository productRepository, UserService userService,
            CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.userService = userService;
    }

    @Override
    public Product createProduct(CreateProductRequest req) {
        // TODO Auto-generated method stub
        Category topLevel = categoryRepository.findByName(req.getTopLevelCategory());

        if (topLevel == null) {
            Category topLevelCategory = new Category();
            topLevelCategory.setName(req.getTopLevelCategory());
            topLevelCategory.setLevel(1);
            topLevel = categoryRepository.save(topLevelCategory);
        }

        Category secondLevel = categoryRepository.findByNameAndParent(req.getSecondLevelCategory(), topLevel.getName());

        if (secondLevel == null) {
            Category secondLevelCategory = new Category();
            secondLevelCategory.setName(req.getSecondLevelCategory());
            secondLevelCategory.setParentCategory(topLevel);
            secondLevelCategory.setLevel(2);
            secondLevel = categoryRepository.save(secondLevelCategory);
        }

        Category thirdLevel = categoryRepository.findByNameAndParent(req.getThirdLevelCategory(),
                secondLevel.getName());

        if (thirdLevel == null) {
            Category thirdLevelCategory = new Category();
            thirdLevelCategory.setName(req.getThirdLevelCategory());
            thirdLevelCategory.setParentCategory(secondLevel);
            thirdLevelCategory.setLevel(3);
            thirdLevel = categoryRepository.save(thirdLevelCategory);
        }

        Product product = new Product();
        product.setTitle(req.getTitle());
        product.setColor(req.getColor());
        product.setDescription(req.getDescription());
        product.setBrand(req.getBrand());
        product.setDiscountedPrice(req.getDiscountedPrice());
        product.setDiscountedPercent(req.getDiscountPercent());
        product.setImageUrl(req.getImageUrl());
        product.setPrice(req.getPrice());
        product.setQuantity(req.getQuantity());
        product.setCreatedAt(LocalDateTime.now());
        product.setSizes(req.getSize());
        product.setCategory(thirdLevel);

        Product saveProduct = productRepository.save(product);

        return saveProduct;
    }

    @Override
    public String deleteProduct(Long productId) throws ProductException {
        // TODO Auto-generated method stub
        Product product = findProductById(productId);
        product.getSizes().clear();
        productRepository.delete(product);
        return "Product deleted Successfully";
    }

    @Override
    public Product updateProduct(Long productId, Product req) throws ProductException {
        // TODO Auto-generated method stub
        Product product = findProductById(productId);

        if (req.getQuantity() != 0) {
            product.setQuantity(req.getQuantity());
        }
        return productRepository.save(product);
    }

    @Override
    public Product findProductById(Long id) throws ProductException {
        // TODO Auto-generated method stub

        Optional<Product> opt = productRepository.findById(id);

        if (opt.isPresent()) {
            return opt.get();
        }
        throw new ProductException("Product not found with id: " + id);
    }

    @Override
    public List<Product> findProductByCategory(String category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findProductByCategory'");
    }

    @Override
    public Page<Product> getAllProduct(String category, List<String> colors, List<String> sizes, Integer minPrice,
            Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize) {
        // TODO Auto-generated method stub

        Pageable pageable = PageRequest.of(pageNumber, pageSize);

        List<Product> products = productRepository.filterProducts(category, minPrice, maxPrice, minDiscount, sort);

        if (colors.isEmpty()) {
            products = products.stream().filter(p -> colors.stream().anyMatch(c -> c.equalsIgnoreCase(p.getColor())))
                    .collect(Collectors.toList());
        }
        if (stock != null) {
            if (stock.equals("in_stock")) {
                products = products.stream().filter(p -> p.getQuantity() > 0).collect(Collectors.toList());
            } else if (stock.equals("out_of_stock")) {
                products = products.stream().filter(p -> p.getQuantity() < 1).collect(Collectors.toList());
            }
        }

        int startIndex = (int) pageable.getOffset();
        int endIndex = Math.min(startIndex + pageable.getPageSize(), products.size());

        List<Product> pageContent = products.subList(startIndex, endIndex);

        Page<Product> filteredProducts = new PageImpl<>(pageContent, pageable, products.size());

        return filteredProducts;
    }

}
