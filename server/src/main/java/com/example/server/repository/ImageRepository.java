package com.example.server.repository;

import com.example.server.entity.ImageEntity;
import com.example.server.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Integer> {
}
