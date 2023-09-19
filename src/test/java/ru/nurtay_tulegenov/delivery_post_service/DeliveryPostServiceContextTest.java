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
import ru.nurtay_tulegenov.delivery_post_service.mapper.EntityResponseMapper;
import ru.nurtay_tulegenov.delivery_post_service.repository.DeliveryRepository;
import ru.nurtay_tulegenov.delivery_post_service.repository.PostOfficeRepository;
import ru.nurtay_tulegenov.delivery_post_service.service.DeliveryService;
import ru.nurtay_tulegenov.delivery_post_service.service.PostOfficeService;

@RunWith(Runner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK
)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-integration_test.properties")
public class DeliveryPostServiceContextTest {

    @Autowired
    PostOfficeService postOfficeService;
    @Autowired
    DeliveryService deliveryService;
    @Autowired
    DeliveryRepository deliveryRepository;
    @Autowired
    PostOfficeRepository postOfficeRepository;
    @Autowired
    EntityResponseMapper mapper;
    @Autowired
    DeliveryController controller;
    @Test
    void assertContextBuilding() {
        Assert.assertNotNull(postOfficeService);
        Assert.assertNotNull(deliveryService);
        Assert.assertNotNull(deliveryRepository);
        Assert.assertNotNull(postOfficeRepository);
        Assert.assertNotNull(mapper);
        Assert.assertNotNull(controller);
    }
}
