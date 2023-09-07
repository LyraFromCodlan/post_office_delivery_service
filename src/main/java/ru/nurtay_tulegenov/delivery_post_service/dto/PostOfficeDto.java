package ru.nurtay_tulegenov.delivery_post_service.dto;

import lombok.Data;

@Data
public class PostOfficeDto {
    private String name;
    private String code;
    private String address;
}
