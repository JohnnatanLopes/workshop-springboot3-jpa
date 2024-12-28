package com.educanadoweb.course.repositories;

import com.educanadoweb.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
