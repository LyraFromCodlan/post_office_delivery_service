package ru.nurtay_tulegenov.delivery_post_service.service.service_implementtion;

import org.springframework.stereotype.Service;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.mapper.EntityResponseMapper;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;
import ru.nurtay_tulegenov.delivery_post_service.service.PostOfficeService;

@Service
//@RequiredArgsConstructor
public class PostOfficeServiceImp implements PostOfficeService {
    private final EntityResponseMapper mapper;

    public PostOfficeServiceImp(EntityResponseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public PostOffice registerPostOffice(PostOfficeDto dto) {
        return null;
    }
}
