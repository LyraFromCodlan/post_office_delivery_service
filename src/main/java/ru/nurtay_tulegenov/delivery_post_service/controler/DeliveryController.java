package ru.nurtay_tulegenov.delivery_post_service.controler;


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
//@RequiredArgsConstructor
@RequestMapping("delivery_service")
public class DeliveryController {
    private final DeliveryService deliveryService;
    private final PostOfficeService postOfficeService;
    private final EntityResponseMapper mapper;

    public DeliveryController(DeliveryService deliveryService, PostOfficeService postOfficeService, EntityResponseMapper mapper) {
        this.deliveryService = deliveryService;
        this.postOfficeService = postOfficeService;
        this.mapper = mapper;
    }

    @PostMapping("register/post_office")
    @ResponseBody
    public Response registerPostOffice(@RequestBody PostOfficeDto dto){
        return null;
//                mapper.mapPostOfficeToResponse(postOfficeService.registerPostOffice(dto));
    }

    @PostMapping("register/delivery")
    @ResponseBody
    public Response registerDelivery(DeliveryDto request){
        return null;
//        mapper.mapDeliveryToResponse(deliveryService.registerDelivery(request));
    }

    @PostMapping("register/reception/{id}")
    @ResponseBody
    public Boolean registerReception(@RequestParam("id")Long id){
        return null;
//        deliveryService.registerReception(id);
    }

    @PostMapping("move/delivery/{post_office_code}/{delivery_id}")
    @ResponseBody
    public Response moveDelivery(@RequestParam(name = "post_office_code") String postOfficeCode, @RequestParam(name = "delivery_id")Long deliveryId){
        return null;
//                mapper.mapDeliveryToResponse(deliveryService.moveDelivery(postOfficeCode, deliveryId));
    }

    @GetMapping("info/delivery/{id}")
    @ResponseBody
    public Response getDeliveryInfo(@RequestParam("id") Long id){
        return null;
//        mapper.mapDeliveryToResponse(deliveryService.getDeliveryInfo(id));
    }

    @GetMapping("info/history/{id}")
    @ResponseBody
    public List<Response> getDilveryHistory(@RequestParam(name = "id") Long id){
        return null;
//        mapper.mapHistoryListToResponseList(deliveryService.getDeliveryHistory(id));
    }

    @GetMapping("test")
    @ResponseBody
    public String getString(){
        return "string";
    }
}
