package ru.nurtay_tulegenov.delivery_post_service.dto;

import lombok.Data;

@Data
public class Response {
    private String deliveryId;
    private String postOfficeId;
    private String currentAddress;
    private String destinationAddress;
    private String receiverName;
    private Boolean deliveryCompleted;
}
