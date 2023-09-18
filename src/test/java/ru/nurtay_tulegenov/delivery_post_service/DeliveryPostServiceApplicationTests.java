package ru.nurtay_tulegenov.delivery_post_service;

import lombok.AllArgsConstructor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;
import ru.nurtay_tulegenov.delivery_post_service.service.PostOfficeService;

@SpringBootTest
class DeliveryPostServiceApplicationTests {

    @Test
    void contextLoads() {
        PostOffice postOffice = new PostOffice();
        postOffice.setName("Raccoon city PD");
        postOffice.setCode("rc_pd");
        postOffice.setAddress("Bright Avenue");
        Assert.assertEquals("Raccoon city PD",postOffice.getName());
        Assert.assertEquals("rc_pd",postOffice.getCode());
        Assert.assertEquals("Bright Avenue",postOffice.getAddress());
    }

}
