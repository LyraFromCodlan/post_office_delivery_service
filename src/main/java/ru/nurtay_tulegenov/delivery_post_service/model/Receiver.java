package ru.nurtay_tulegenov.delivery_post_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "receiver")
public class Receiver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

}
