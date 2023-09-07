package ru.nurtay_tulegenov.delivery_post_service.dto;

import lombok.Data;
import ru.nurtay_tulegenov.delivery_post_service.enums.DeliveryType;

import java.util.Date;

@Data
public class Response {
    private String deliveryId;
    private String postOfficeId;
    private String postOfficeName;
    private String postOfficeCode;
    private String address;
    private String currentAddress;
    private String destinationAddress;
    private String receiverName;
    private Boolean deliveryCompleted;
    private DeliveryType deliveryType;
    private Date date;
    private String status;
}
