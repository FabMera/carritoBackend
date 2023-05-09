package com.fabianmera.backend.cartapp.services;

import java.util.List;

import com.fabianmera.backend.cartapp.models.entity.Product;

public interface ProductService {
    List<Product> findAll();
    
}
