package ru.nurtay_tulegenov.delivery_post_service.service.service_implementtion;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.mapper.EntityResponseMapper;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;
import ru.nurtay_tulegenov.delivery_post_service.service.PostOfficeService;

@Service
@RequiredArgsConstructor
public class PostOfficeServiceImp implements PostOfficeService {
    private EntityResponseMapper mapper;
    @Override
    public PostOffice registerPostOffice(PostOfficeDto dto) {
        return null;
    }
}
