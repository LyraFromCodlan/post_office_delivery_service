package ru.nurtay_tulegenov.delivery_post_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "post_office")
public class PostOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
}
