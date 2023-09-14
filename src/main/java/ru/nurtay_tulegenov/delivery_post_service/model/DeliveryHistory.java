package ru.nurtay_tulegenov.delivery_post_service.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import ru.nurtay_tulegenov.delivery_post_service.enums.DeliveryType;
import ru.nurtay_tulegenov.delivery_post_service.enums.Status;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "delivery_history")
public class DeliveryHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "delivery_id", nullable = false)
    private Delivery delivery;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "post_office_id")
    private PostOffice postOffice;

    @JsonFormat(pattern="MM-dd-yyyy HH:mm:ss")
    private Date date = new Date();

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Transient
    private Long deliveryId;
    @Transient
    private DeliveryType deliveryType;
    @Transient
    private String destinationAddress;
    @Transient
    private String receiverName;
    @Transient
    private Boolean deliveryCompleted;
    @Transient
    private String postOfficeName;
    @Transient
    private String address;

    @PostLoad
    void FillTransientFieldsAndEmptyLinkedEntitiesForResponse(){
        this.deliveryId = this.getDelivery().getId();
        this.deliveryType = this.getDelivery().getDeliveryType();
        this.destinationAddress = this.getDelivery().getReceiverAddress();
        this.receiverName = this.getDelivery().getReceiverName();
        this.deliveryCompleted = this.getDelivery().getIsReceived();
        this.postOfficeName = this.getPostOffice().getName();
        this.address = this.getPostOffice().getAddress();
    }

}
