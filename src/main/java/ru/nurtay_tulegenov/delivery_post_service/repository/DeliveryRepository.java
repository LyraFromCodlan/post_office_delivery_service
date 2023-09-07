package ru.nurtay_tulegenov.delivery_post_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nurtay_tulegenov.delivery_post_service.model.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
