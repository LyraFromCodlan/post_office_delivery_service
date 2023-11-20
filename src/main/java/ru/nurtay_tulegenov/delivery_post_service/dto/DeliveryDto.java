package ru.nurtay_tulegenov.delivery_post_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.nurtay_tulegenov.delivery_post_service.enums.DeliveryType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryDto {
    private String receiverIndex;
    private String receiverAddress;
    private String receiverName;
    private DeliveryType deliveryType;
    private String postOfficeCode;
}
