package com.kazstore.store.services;

import com.kazstore.store.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository  extends JpaRepository<Product, Integer> {
}
