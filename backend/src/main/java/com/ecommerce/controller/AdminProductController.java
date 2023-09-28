package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.exception.ProductException;
import com.ecommerce.model.ApiResponse;
import com.ecommerce.model.Product;
import com.ecommerce.request.CreateProductRequest;
import com.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api/admin/products")
public class AdminProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/")
    public ResponseEntity<Product> createProduct(@RequestBody CreateProductRequest req) {

        Product product = productService.createProduct(req);

        return new ResponseEntity<Product>(product, HttpStatus.CREATED);

    }

    public ResponseEntity<ApiResponse> createMultipleProduct(@RequestBody CreateProductRequest[] req) {
        for (CreateProductRequest product : req) {
            productService.createProduct(product);
        }
        ApiResponse res = new ApiResponse();
        res.setMessage("Products created successfully");
        res.setSuccess(true);

        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProduct() {
        Page<Product> productPage = productService.getAllProduct(null, null, null, null, null, null, null, null, null,
                null);
        List<Product> products = productPage.getContent();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PutMapping("/{productId}/update")
    public ResponseEntity<Product> updateProduct(@RequestBody Product req, @PathVariable Long productId)
            throws ProductException {
        Product product = productService.updateProduct(productId, req);
        return new ResponseEntity<Product>(product, HttpStatus.CREATED);
    }

    @DeleteMapping("/{productId}/delete")
    public ResponseEntity<ApiResponse> deleteProduct(@PathVariable Long productId) throws ProductException {

        productService.deleteProduct(productId);
        ApiResponse response = new ApiResponse();
        response.setMessage("Product deleted successfully");
        response.setSuccess(true);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
