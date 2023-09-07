package ru.nurtay_tulegenov.delivery_post_service.controler;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.nurtay_tulegenov.delivery_post_service.dto.DeliveryDto;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.dto.Response;
import ru.nurtay_tulegenov.delivery_post_service.mapper.EntityResponseMapper;
import ru.nurtay_tulegenov.delivery_post_service.service.DeliveryService;
import ru.nurtay_tulegenov.delivery_post_service.service.PostOfficeService;

@RestController
@Slf4j
@CrossOrigin
@AllArgsConstructor
@RequestMapping("delivery_service")
public class DeliveryController {
    private final DeliveryService deliveryService;
    private final PostOfficeService postOfficeService;
    private final EntityResponseMapper mapper;
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
    public Boolean registerReception(@RequestParam("id")Long id){

        return deliveryService.registerReception(id);
    }

    @PostMapping("move/delivery")
    @ResponseBody
    public Response moveDelivery(@RequestBody PostOfficeDto dto){
        return mapper.mapDeliveryToResponse(deliveryService.moveDelivery(dto));
    }

    @GetMapping("info/delivery/{id}")
    @ResponseBody
    public Response getDeliveryInfo(@RequestParam("id") Long id){
        return mapper.mapDeliveryToResponse(deliveryService.getDeliveryInfo(id));
    }
    @GetMapping("test")
    @ResponseBody
    public String getString(){
        return "string";
    }
}
