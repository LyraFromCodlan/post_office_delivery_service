package ru.nurtay_tulegenov.delivery_post_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nurtay_tulegenov.delivery_post_service.model.Delivery;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;

import java.util.List;

@Repository
public interface PostOfficeRepository extends JpaRepository<PostOffice, Long> {
    PostOffice findByCodeIgnoreCase(String code);
}
