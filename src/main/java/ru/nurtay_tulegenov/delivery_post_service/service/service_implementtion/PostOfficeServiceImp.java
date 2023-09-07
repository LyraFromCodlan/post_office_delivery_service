package ru.nurtay_tulegenov.delivery_post_service.service.service_implementtion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.mapper.EntityResponseMapper;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;
import ru.nurtay_tulegenov.delivery_post_service.service.PostOfficeService;

@Service
@AllArgsConstructor
public class PostOfficeServiceImp implements PostOfficeService {
    private final EntityResponseMapper mapper;
    @Override
    public PostOffice registerPostOffice(PostOfficeDto dto) {
        return null;
    }
}
