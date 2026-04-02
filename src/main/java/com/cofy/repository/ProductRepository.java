package com.cofy.repository;

import com.cofy.model.Product;
import com.cofy.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductType(ProductType type);
}
