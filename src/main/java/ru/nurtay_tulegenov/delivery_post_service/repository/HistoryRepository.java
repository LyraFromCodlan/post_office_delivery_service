package ru.nurtay_tulegenov.delivery_post_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nurtay_tulegenov.delivery_post_service.model.Delivery;
import ru.nurtay_tulegenov.delivery_post_service.model.DeliveryHistory;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;

import java.util.Date;
import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<DeliveryHistory, Long> {
    List<DeliveryHistory> findAllByDelivery(Delivery delivery);
    List<DeliveryHistory> findAllByPostOffice(PostOffice postOffice);
    List<DeliveryHistory> findAllByPostOfficeAndAndDateBetween(PostOffice postOffice, Date beginDate, Date endDate);
}
