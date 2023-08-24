package ru.nurtay_tulegenov.delivery_post_service.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Set;

@Data
@Entity(name = "receiver")
public class Receiver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "receiver")
    @Fetch(FetchMode.SELECT)
    @Column(name = "delivery_id")
    private Set<Delivery> delivery;
}
