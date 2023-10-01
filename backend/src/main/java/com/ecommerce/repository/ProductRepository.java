package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
<<<<<<< HEAD
        @Query("SELECT p FROM Product p " +
                        "WHERE (p.category.name = :category OR :category = '') " +
                        "AND ((:minPrice IS NULL AND :maxPrice IS NULL) OR (p.discountedPrice BETWEEN :minPrice AND :maxPrice)) "
                        +
                        "AND (:minDiscount IS NULL OR p.discountedPercent >= :minDiscount) " +
                        "ORDER BY " +
                        "CASE WHEN :sort = 'price_low' THEN p.discountedPrice END ASC, " +
                        "CASE WHEN :sort = 'price_high' THEN p.discountedPrice END DESC")
        public List<Product> filterProducts(
                        @Param("category") String category,
                        @Param("minPrice") Integer minPrice,
                        @Param("maxPrice") Integer maxPrice,
                        @Param("minDiscount") Integer minDiscount,
                        @Param("sort") String sort);

=======
    @Query("SELECT p FROM Product p " +
           "WHERE (p.category.name = :category OR :category = '') " +
           "AND ((:minPrice IS NULL AND :maxPrice IS NULL) OR (p.discountedPrice BETWEEN :minPrice AND :maxPrice)) " +
           "AND (:minDiscount IS NULL OR p.discountedPercent >= :minDiscount) " +
           "ORDER BY " +
           "CASE WHEN :sort = 'price_low' THEN p.discountedPrice END ASC, " +
           "CASE WHEN :sort = 'price_high' THEN p.discountedPrice END DESC")
    Page<Product> filterProducts(
            @Param("category") String category,
            @Param("minPrice") Integer minPrice,
            @Param("maxPrice") Integer maxPrice,
            @Param("minDiscount") Integer minDiscount,
            @Param("sort") String sort,
            Pageable pageable); // Add Pageable parameter here
>>>>>>> a8e9538bbf7f5e2ed41a231c6bec4c31626bccf9
}

