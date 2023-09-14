package ru.nurtay_tulegenov.delivery_post_service.dto;

import jakarta.persistence.Column;
import lombok.Data;
import ru.nurtay_tulegenov.delivery_post_service.enums.DeliveryType;

@Data
public class DeliveryDto {
    private String receiverIndex;
    private String receiveAddress;
    private String receiverName;
    private DeliveryType deliveryType;

    private String PostOfficeCode;
}
