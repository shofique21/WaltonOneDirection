package com.walton.one.direction.waltonOneDirection.repository;

import com.walton.one.direction.waltonOneDirection.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
