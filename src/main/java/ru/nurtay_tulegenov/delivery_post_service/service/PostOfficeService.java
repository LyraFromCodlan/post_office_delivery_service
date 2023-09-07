package ru.nurtay_tulegenov.delivery_post_service.service;

import org.springframework.stereotype.Service;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;

@Service
public interface PostOfficeService {
    PostOffice registerPostOffice(PostOfficeDto dto);
}
