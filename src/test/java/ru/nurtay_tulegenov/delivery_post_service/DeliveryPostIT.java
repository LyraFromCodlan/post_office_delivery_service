package ru.nurtay_tulegenov.delivery_post_service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import ru.nurtay_tulegenov.delivery_post_service.controler.DeliveryController;
import ru.nurtay_tulegenov.delivery_post_service.mapper.EntityResponseMapper;
import ru.nurtay_tulegenov.delivery_post_service.repository.DeliveryRepository;
import ru.nurtay_tulegenov.delivery_post_service.repository.PostOfficeRepository;
import ru.nurtay_tulegenov.delivery_post_service.service.DeliveryService;
import ru.nurtay_tulegenov.delivery_post_service.service.PostOfficeService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class DeliveryPostIT {
    @Autowired
    WebApplicationContext wac;
    MockMvc mvc;

    @MockBean
    PostOfficeService postOfficeService;
    @MockBean
    DeliveryService deliveryService;
    @MockBean
    DeliveryRepository deliveryRepository;
    @MockBean
    PostOfficeRepository postOfficeRepository;
    @MockBean
    EntityResponseMapper mapper;
    @MockBean
    DeliveryController controller;

    @BeforeEach
    void setUp(){
        this.mvc = MockMvcBuilders
                .webAppContextSetup(this.wac)
                .build();
    }
    @Test
    void assertTestHtppRequest() throws Exception {
        mvc.perform(get("/delivery_service/test"))
                .andExpect(status().isOk())
                .andExpect(result -> result.getRequest().getParameter("string"));
    }
}
