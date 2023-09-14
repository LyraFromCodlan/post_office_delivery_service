package ru.nurtay_tulegenov.delivery_post_service.service.service_implementtion;

import org.springframework.stereotype.Service;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.mapper.EntityResponseMapper;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;
import ru.nurtay_tulegenov.delivery_post_service.repository.PostOfficeRepository;
import ru.nurtay_tulegenov.delivery_post_service.service.PostOfficeService;

@Service
//@RequiredArgsConstructor
public class PostOfficeServiceImp implements PostOfficeService {
    private final EntityResponseMapper mapper;
    private final PostOfficeRepository postOfficeRepository;

    public PostOfficeServiceImp(EntityResponseMapper mapper, PostOfficeRepository postOfficeRepository) {
        this.mapper = mapper;
        this.postOfficeRepository = postOfficeRepository;
    }

    @Override
    public PostOffice registerPostOffice(PostOfficeDto dto) {
        try{
            return postOfficeRepository.save(mapper.mapPostOfficeDtoToPostOffice(dto));
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }
}
