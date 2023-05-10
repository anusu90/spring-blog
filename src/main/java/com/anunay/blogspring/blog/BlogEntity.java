package com.anunay.blogspring.blog;

import jakarta.persistence.*;

import java.util.UUID;

@Entity()
public class BlogEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    UUID id;
}
