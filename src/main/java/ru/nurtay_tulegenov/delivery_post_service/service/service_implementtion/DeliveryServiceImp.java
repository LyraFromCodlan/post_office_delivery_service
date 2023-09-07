package ru.nurtay_tulegenov.delivery_post_service.service.service_implementtion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nurtay_tulegenov.delivery_post_service.dto.DeliveryDto;
import ru.nurtay_tulegenov.delivery_post_service.mapper.EntityResponseMapper;
import ru.nurtay_tulegenov.delivery_post_service.model.Delivery;
import ru.nurtay_tulegenov.delivery_post_service.model.DeliveryHistory;
import ru.nurtay_tulegenov.delivery_post_service.service.DeliveryService;

import java.util.List;

@Service
@AllArgsConstructor
public class DeliveryServiceImp implements DeliveryService {
    private final EntityResponseMapper mapper;
    @Override
    public Delivery registerDelivery(DeliveryDto request) {
        return null;
    }

    @Override
    public Delivery moveDelivery(String postOfficeCode, Long deliveryId) {
        return null;
    }

    @Override
    public Delivery getDeliveryInfo(Long id) {
        return null;
    }

    @Override
    public List<DeliveryHistory> getDeliveryHistory(Long id) {
        return null;
    }

    @Override
    public Boolean registerReception(Long id) {
        return null;
    }
}
