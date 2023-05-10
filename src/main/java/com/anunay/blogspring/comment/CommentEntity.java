package com.anunay.blogspring.comment;

import jakarta.persistence.*;

import java.util.UUID;

@Entity()
public class CommentEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column( nullable = false)
    UUID uuid;
}
