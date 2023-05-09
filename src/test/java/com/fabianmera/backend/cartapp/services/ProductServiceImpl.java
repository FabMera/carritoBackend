package com.fabianmera.backend.cartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fabianmera.backend.cartapp.models.entity.Product;
import com.fabianmera.backend.cartapp.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        //cast to List<Product>
        return (List<Product>) repository.findAll();
    }

}
