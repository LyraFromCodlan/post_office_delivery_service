package ru.nurtay_tulegenov.delivery_post_service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import ru.nurtay_tulegenov.delivery_post_service.controler.DeliveryController;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.dto.Response;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;
import ru.nurtay_tulegenov.delivery_post_service.service.DeliveryService;
import ru.nurtay_tulegenov.delivery_post_service.service.PostOfficeService;

@RunWith(value = Runner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK )
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-integration_test.properties")
class DeliveryPostServiceApplicationTests {
    @Autowired
    DeliveryController deliveryController;

    @Test
    void testPostOfficeRegistration(){
        PostOfficeDto postOfficeDto = new PostOfficeDto();
        postOfficeDto.setName("Raccoon city PD");
        postOfficeDto.setCode("rc_pd");
        postOfficeDto.setAddress("Bright Avenue");
        Response response = deliveryController.registerPostOffice(postOfficeDto);
//        Assert.assertNotNull(response.getPostOfficeId());
        Assert.assertEquals("Raccoon city PD",response.getPostOfficeName());
        Assert.assertEquals("rc_pd",response.getPostOfficeCode());
        Assert.assertEquals("Bright Avenue",response.getAddress());
    }

}
