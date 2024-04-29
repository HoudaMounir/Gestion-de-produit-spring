package com.example.gestinProduit.repositories;

import com.example.gestinProduit.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductsRepository extends JpaRepository<Product, Long> {

}
