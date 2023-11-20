package ru.nurtay_tulegenov.delivery_post_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostOfficeDto {
    private String name;
    private String code;
    private String address;
}
