package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name="t_user")
public class UserEntity {
    @Id
    private String email;

    @Column(nullable = false, name="type")
    private int type;
}
