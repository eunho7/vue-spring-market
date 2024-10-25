package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name="t_image")
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, name="type")
    private int type;

    @Column(nullable = false, name="path")
    private String path;

    /* Product : Image = 1 : N*/
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id")
    private ProductEntity product;
}
