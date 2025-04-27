package com.example.springwithjpa.repository;


import com.example.springwithjpa.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<product, Long> {
}
