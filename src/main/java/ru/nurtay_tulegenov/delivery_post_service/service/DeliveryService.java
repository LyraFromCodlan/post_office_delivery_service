package ru.nurtay_tulegenov.delivery_post_service.service;

import org.springframework.stereotype.Service;
import ru.nurtay_tulegenov.delivery_post_service.dto.DeliveryDto;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.model.Delivery;
import ru.nurtay_tulegenov.delivery_post_service.model.DeliveryHistory;

import java.util.List;

@Service
public interface DeliveryService {
    Delivery registerDelivery(DeliveryDto request);
    Delivery moveDelivery(String postOfficeCode, Long deliveryId);
    Delivery getDeliveryInfo(Long id);
    List<DeliveryHistory> getDeliveryHistory(Long id);
    Boolean registerReception(Long id);
}
