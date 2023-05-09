package com.fabianmera.backend.cartapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fabianmera.backend.cartapp.models.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
