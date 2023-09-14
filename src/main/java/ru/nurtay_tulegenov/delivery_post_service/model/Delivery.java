package ru.nurtay_tulegenov.delivery_post_service.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import ru.nurtay_tulegenov.delivery_post_service.enums.DeliveryType;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "delivery_type")
    @Enumerated(EnumType.STRING)
    private DeliveryType deliveryType;

    @Column(name = "receiver_index")
    private String receiverIndex;

    @Column(name = "address")
    private String receiverAddress;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "is_received")
    Boolean isReceived = false;

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.ALL})
    @Fetch(FetchMode.JOIN)
    @JoinColumn(
            name = "post_office_id"
    )
    private PostOffice postOffice;
}
