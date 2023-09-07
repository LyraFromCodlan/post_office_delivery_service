package ru.nurtay_tulegenov.delivery_post_service.service;

import org.springframework.stereotype.Service;
import ru.nurtay_tulegenov.delivery_post_service.dto.DeliveryDto;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.model.Delivery;

@Service
public interface DeliveryService {
    Delivery registerDelivery(DeliveryDto request);
    Delivery moveDelivery(PostOfficeDto dto);
    Delivery getDeliveryInfo(Long id);
    Boolean registerReception(Long id);
}
