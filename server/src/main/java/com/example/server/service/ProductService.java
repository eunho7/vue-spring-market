package com.example.server.service;

import com.example.server.dto.ProductDTO;
import com.example.server.entity.ProductEntity;
import com.example.server.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public List<ProductDTO> findAll() {
        List<ProductEntity> products = productRepository.findAll();
        List<ProductDTO> productDTOList = new ArrayList<>();
        for(ProductEntity product : products) {
            productDTOList.add(ProductDTO.toProductDTO(product));
        }
        return productDTOList;
    }
}
