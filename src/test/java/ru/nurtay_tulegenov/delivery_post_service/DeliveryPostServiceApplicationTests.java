package ru.nurtay_tulegenov.delivery_post_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.util.Assert;
import ru.nurtay_tulegenov.delivery_post_service.controler.DeliveryController;
import ru.nurtay_tulegenov.delivery_post_service.dto.PostOfficeDto;
import ru.nurtay_tulegenov.delivery_post_service.dto.Response;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
        assertNotNull(response.getPostOfficeId());
        assertNotNull("Raccoon city PD",response.getPostOfficeName());
        assertNotNull("rc_pd",response.getPostOfficeCode());
        assertNotNull("Bright Avenue",response.getAddress());
    }

}
