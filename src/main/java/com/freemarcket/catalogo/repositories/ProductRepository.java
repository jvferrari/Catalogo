package com.freemarcket.catalogo.repositories;

import com.freemarcket.catalogo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
