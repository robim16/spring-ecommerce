package com.example.demo.repositories;

import com.example.demo.dto.ProductListDTO;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT new com.example.demo.dto.ProductListDTO(p.id, p.name, p.description, p.price, p.quantity, p.image) FROM Product p")
    List<ProductListDTO> findAllWithoutComments();
}
