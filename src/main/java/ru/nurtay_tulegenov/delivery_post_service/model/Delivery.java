package ru.nurtay_tulegenov.delivery_post_service.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Set;

@Data
@Entity(name = "delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "delivery_type")
    @Enumerated(EnumType.STRING)
    private DeliveryType deliveryType;

    @Column(name = "address")
    private String address;

    @Column(name = "is_received")
    Boolean isReceived;
    @ManyToOne
    @Fetch(FetchMode.SELECT)
    @Column(name = "receiver_id")
    private Receiver receiver;
    @ManyToOne
    @Fetch(FetchMode.SELECT)
    @Column(name = "post_office_id")
    private PostOffice postOffice;
    private enum DeliveryType{
        LETTER,
        PARCEL,
        WRAPPER,
        POSTCARD
    }
}
