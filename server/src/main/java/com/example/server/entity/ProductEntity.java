package com.example.server.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name="t_product")
public class ProductEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, name="product_name")
    private String name;

    @Column(nullable = false, name="product_price")
    private int price;

    @Column(nullable = false, name="delivery_price")
    private int deliveryPrice;

    @Column(nullable = false, name="add_delivery_price")
    private int addDeliveryPrice;

    @Column(name="tags", length = 100)
    private String tags;

    @Column(nullable = false, name="outboud_days")
    private int outboundDays;

    @Column(name = "active_yn", nullable = false, columnDefinition = "enum('Y','N')")
    private String activeYn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="seller_id")
    private SellerEntity seller;

    @OneToMany(mappedBy = "product",
            cascade = CascadeType.REMOVE,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private List<ImageEntity> imageEntityList = new ArrayList<>();
}
