package com.example.springwithjpa.controller;


import com.example.springwithjpa.model.product;
import com.example.springwithjpa.service.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productcontroller {
    @Autowired
    public productservice productService;

    @GetMapping("/getproduct")
    public List<product> getproduct(){
        return productService.getproduct();

    }
    @GetMapping("/{id}")
    public ResponseEntity<product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public product createProduct(@RequestBody product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/addbyid/{id}")
    public ResponseEntity<product> updateProduct(@PathVariable Long id, @RequestBody product product) {
        product updated = productService.updateProduct(id, product);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}



