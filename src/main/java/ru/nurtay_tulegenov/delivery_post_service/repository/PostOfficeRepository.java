package ru.nurtay_tulegenov.delivery_post_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;
@Repository
public interface PostOfficeRepository extends JpaRepository<PostOffice, Long> {
}
