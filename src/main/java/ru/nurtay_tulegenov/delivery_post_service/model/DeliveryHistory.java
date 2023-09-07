package ru.nurtay_tulegenov.delivery_post_service.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Date;

@Data
@Entity(name = "delivery_history")
public class DeliveryHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "delivery_id", nullable = false)
    private Delivery delivery;

    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "post_office_id")
    private PostOffice postOffice;

    @JsonFormat(pattern="MM-dd-yyyy HH:mm:ss")
    private Date date = new Date();

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    private enum Status{
        REGISTERED,
        TRANSFERRED,
        COLLECTED
    }
}
