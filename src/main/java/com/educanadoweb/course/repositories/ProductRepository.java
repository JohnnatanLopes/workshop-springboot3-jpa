package com.educanadoweb.course.repositories;

import com.educanadoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
