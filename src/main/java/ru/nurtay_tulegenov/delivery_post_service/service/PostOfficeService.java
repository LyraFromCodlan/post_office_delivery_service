package ru.nurtay_tulegenov.delivery_post_service.service;

import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;

public interface PostOfficeService {
    PostOffice registerPostOffice(PostOfficeDto dto);
}
