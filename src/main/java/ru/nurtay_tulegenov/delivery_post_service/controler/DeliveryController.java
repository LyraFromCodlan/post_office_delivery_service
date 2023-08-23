package ru.nurtay_tulegenov.delivery_post_service.controler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@CrossOrigin
@RequestMapping("delivery_service")
public class DeliveryController {

    @GetMapping("test")
    public String getString(){
        return "string";
    }
}
