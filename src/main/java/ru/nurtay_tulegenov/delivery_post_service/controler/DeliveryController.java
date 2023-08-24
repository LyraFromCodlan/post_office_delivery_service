package ru.nurtay_tulegenov.delivery_post_service.controler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nurtay_tulegenov.delivery_post_service.dto.Response;

@RestController
@Slf4j
@CrossOrigin
@RequestMapping("delivery_service")
public class DeliveryController {
    @PostMapping("register/post_office")
    public ResponseEntity<Boolean> registerPostOffice(){
        return ResponseEntity.ok(true);
    }

    @PostMapping("register/delivery")
    public ResponseEntity<Boolean> registerDelivery(){
        return ResponseEntity.ok(true);
    }

    @PostMapping("register/reception")
    public ResponseEntity<Boolean> registerReception(){
        return ResponseEntity.ok(true);
    }

    @PostMapping("move/delivery")
    public ResponseEntity<Boolean> moveDelivery(){
        return ResponseEntity.ok(true);
    }

    @GetMapping("info/delivery")
    public ResponseEntity<Response> getDeliveryInfo(){
        return ResponseEntity.ok(new Response());
    }
    @GetMapping("test")
    public String getString(){
        return "string";
    }
}
