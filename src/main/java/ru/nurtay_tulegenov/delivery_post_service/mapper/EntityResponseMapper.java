package ru.nurtay_tulegenov.delivery_post_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.nurtay_tulegenov.delivery_post_service.dto.DeliveryDto;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.model.DeliveryHistory;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;
import ru.nurtay_tulegenov.delivery_post_service.dto.Response;
import ru.nurtay_tulegenov.delivery_post_service.model.Delivery;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EntityResponseMapper {
    Response mapPostOfficeToResponse(PostOffice postOffice);
    Response mapDeliveryToResponse(Delivery delivery);
    Response mapHistoryToResponse(DeliveryHistory history);
    List<Response> mapHistoryListToResponseList(List<DeliveryHistory> deliveryHistoryList);
    Delivery mapDeliveryDtoToDelivery(DeliveryDto dto);
    PostOffice mapPostOfficeDtoToPostOffice(PostOfficeDto dto);
}
