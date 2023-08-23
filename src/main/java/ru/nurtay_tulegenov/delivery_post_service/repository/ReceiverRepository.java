package ru.nurtay_tulegenov.delivery_post_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nurtay_tulegenov.delivery_post_service.model.Receiver;

public interface ReceiverRepository extends JpaRepository<Receiver, Long> {
}
