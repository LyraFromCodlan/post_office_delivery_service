package ru.nurtay_tulegenov.delivery_post_service.controler;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.nurtay_tulegenov.delivery_post_service.dto.DeliveryDto;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.dto.Response;
import ru.nurtay_tulegenov.delivery_post_service.mapper.EntityResponseMapper;
import ru.nurtay_tulegenov.delivery_post_service.service.DeliveryService;
import ru.nurtay_tulegenov.delivery_post_service.service.PostOfficeService;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("delivery_service")
public class DeliveryController {
    private DeliveryService deliveryService;
    private PostOfficeService postOfficeService;
    private EntityResponseMapper mapper;

    @PostMapping("register/post_office")
    @ResponseBody
    public Response registerPostOffice(@RequestBody PostOfficeDto dto){
        return mapper.mapPostOfficeToResponse(postOfficeService.registerPostOffice(dto));
    }

    @PostMapping("register/delivery")
    @ResponseBody
    public Response registerDelivery(DeliveryDto request){
        return mapper.mapDeliveryToResponse(deliveryService.registerDelivery(request));
    }

    @PostMapping("register/reception/{id}")
    @ResponseBody
    public Boolean registerReception(@PathVariable("id")Long id){
        return deliveryService.registerReception(id);
    }

    @PostMapping("move/delivery/{post_office_code}/{delivery_id}")
    @ResponseBody
    public Response moveDelivery(@PathVariable(name = "post_office_code") String postOfficeCode, @PathVariable(name = "delivery_id")Long deliveryId){
        return mapper.mapDeliveryToResponse(deliveryService.moveDelivery(postOfficeCode, deliveryId));
    }

    @GetMapping("info/delivery/{id}")
    @ResponseBody
    public Response getDeliveryInfo(@PathVariable("id") Long id){
        return mapper.mapDeliveryToResponse(deliveryService.getDeliveryInfo(id));
    }

    @GetMapping("info/history/{id}")
    @ResponseBody
    public List<Response> getDilveryHistory(@PathVariable(name = "id") Long id){
        return  mapper.mapHistoryListToResponseList(deliveryService.getDeliveryHistory(id));
    }

    @GetMapping("test")
    @ResponseBody
    public String getString(){
        return "string";
    }
}
