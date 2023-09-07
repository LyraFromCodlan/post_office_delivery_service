package ru.nurtay_tulegenov.delivery_post_service.mapper;

import org.mapstruct.Mapper;
import ru.nurtay_tulegenov.delivery_post_service.dto.DeliveryDto;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;
import ru.nurtay_tulegenov.delivery_post_service.dto.Response;
import ru.nurtay_tulegenov.delivery_post_service.model.Delivery;

@Mapper(componentModel = "spring")
public interface EntityResponseMapper {
    Response mapPostOfficeToResponse(PostOffice postOffice);
    Response mapDeliveryToResponse(Delivery delivery);
    Delivery mapDeliveryDtoToDelivery(DeliveryDto dto);
    PostOffice mapPostOfficeDtoToPostOffice(PostOfficeDto dto);
}
