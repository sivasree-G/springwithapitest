package com.example.springwithjpa.service;



import com.example.springwithjpa.model.product;
import com.example.springwithjpa.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productservice {
    @Autowired
    public repository productRepository;

    public List<product> getproduct() {
        return  productRepository.findAll();

    }
    public Optional<product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public product createProduct(product product) {
        return productRepository.save(product);
    }

    public product updateProduct(Long id, product updatedProduct) {
        return productRepository.findById(id).map(product -> {
            product.setName(updatedProduct.getName());
            product.setCatogory(updatedProduct.getCatogory());
            product.setPrice(updatedProduct.getPrice());
            return productRepository.save(product);
        }).orElse(null);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
