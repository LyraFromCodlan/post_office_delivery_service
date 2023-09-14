package ru.nurtay_tulegenov.delivery_post_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
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
    @Mapping(source = "name", target = "postOfficeName")
    @Mapping(source = "code", target = "postOfficeCode")
    Response mapPostOfficeToResponse(PostOffice postOffice);
    @Mapping(source = "receiverAddress", target = "address")
    @Mapping(source = "isReceived", target = "deliveryCompleted")
    Response mapDeliveryToResponse(Delivery delivery);
    @Mapping(source = "date", target = "date")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "deliveryId", target = "deliveryId")
    @Mapping(source = "destinationAddress", target = "destinationAddress")
    @Mapping(source = "receiverName", target = "receiverName")
    @Mapping(source = "deliveryCompleted", target = "deliveryCompleted")
    @Mapping(source = "deliveryType", target = "deliveryType")
    Response mapHistoryToResponse(DeliveryHistory history);
    List<Response> mapHistoryListToResponseList(List<DeliveryHistory> deliveryHistoryList);
    Delivery mapDeliveryDtoToDelivery(DeliveryDto dto);
    PostOffice mapPostOfficeDtoToPostOffice(PostOfficeDto dto);
}
