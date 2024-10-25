package com.example.server.repository;

import com.example.server.entity.CategoryEntity;
import com.example.server.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
