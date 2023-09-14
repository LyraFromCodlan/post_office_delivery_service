package ru.nurtay_tulegenov.delivery_post_service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import ru.nurtay_tulegenov.delivery_post_service.enums.DeliveryType;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private String deliveryId;
    private String postOfficeId;
    private String postOfficeName;
    private String postOfficeCode;
    private String address;
    private String currentAddress;
    private String destinationAddress;
    private String receiverName;
    private String receiverIndex;
    private Boolean deliveryCompleted;
    private DeliveryType deliveryType;
    @JsonFormat(pattern="MM-dd-yyyy HH:mm:ss")
    private Date date;
    private String status;
}
