package ru.nurtay_tulegenov.delivery_post_service.dto;

import org.junit.jupiter.api.Test;
import ru.nurtay_tulegenov.delivery_post_service.enums.DeliveryType;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ResponseTest {
    Response dto = new Response(
            "deliveryId"
            , "postOfficeId"
            , "postOfficeName"
            ,"postOfficeCode"
            , "address"
            , "currentAddress"
            , "destinationAddress"
            , "receiverName"
            , "receiverIndex"
            , false
            , DeliveryType.POSTCARD
            , new Date(10000)
            , "REGISTERED"
    );

    @Test
    void getDeliveryId() {
        assertEquals("deliveryId", dto.getDeliveryId());
    }

    @Test
    void getPostOfficeId() {
        assertEquals("postOfficeId", dto.getPostOfficeId());
    }

    @Test
    void getPostOfficeName() {
        assertEquals("postOfficeName",dto.getPostOfficeName());
    }

    @Test
    void getPostOfficeCode() {
        assertEquals("postOfficeCode",dto.getPostOfficeCode());
    }

    @Test
    void getAddress() {
        assertEquals("address",dto.getAddress());
    }

    @Test
    void getCurrentAddress() {
        assertEquals("currentAddress",dto.getCurrentAddress());
    }

    @Test
    void getDestinationAddress() {
        assertEquals("destinationAddress",dto.getDestinationAddress());
    }

    @Test
    void getReceiverName() {
        assertEquals("receiverName",dto.getReceiverName());
    }

    @Test
    void getReceiverIndex() {
        assertEquals("receiverIndex",dto.getReceiverIndex());
    }

    @Test
    void getDeliveryCompleted() {
        assertEquals(false,dto.getDeliveryCompleted());
    }

    @Test
    void getDeliveryType() {
        assertEquals(DeliveryType.POSTCARD,dto.getDeliveryType());
    }

    @Test
    void getDate() {
        assertEquals(new Date(10000),dto.getDate());
    }

    @Test
    void getStatus() {
        assertEquals("REGISTERED",dto.getStatus());
    }

    @Test
    void setDeliveryId() {
        dto.setDeliveryId("newDeliveryId");
        assertEquals("newDeliveryId", dto.getDeliveryId());
    }

    @Test
    void setPostOfficeId() {
        dto.setPostOfficeId("newPostOfficeId");
        assertEquals("newPostOfficeId", dto.getPostOfficeId());
    }

    @Test
    void setPostOfficeName() {
        dto.setPostOfficeName("newName");
        assertEquals("newName", dto.getPostOfficeName());
    }

    @Test
    void setPostOfficeCode() {
        dto.setPostOfficeCode("newCode");
        assertEquals("newCode", dto.getPostOfficeCode());
    }

    @Test
    void setAddress() {
        dto.setAddress("newAddress");
        assertEquals("newAddress", dto.getAddress());
    }

    @Test
    void setCurrentAddress() {
        dto.setCurrentAddress("newDeliveryAddress");
        assertEquals("newDeliveryAddress",dto.getCurrentAddress());
    }

    @Test
    void setDestinationAddress() {
        dto.setDestinationAddress("newDestination");
        assertEquals("newDestination", dto.getDestinationAddress());
    }

    @Test
    void setReceiverName() {
        dto.setReceiverName("newName");
        assertEquals("newName", dto.getReceiverName());
    }

    @Test
    void setReceiverIndex() {
        dto.setReceiverIndex("newIndex");
        assertEquals("newIndex", dto.getReceiverIndex());
    }

    @Test
    void setDeliveryCompleted() {
        dto.setDeliveryCompleted(true);
        assertTrue(dto.getDeliveryCompleted());
    }

    @Test
    void setDeliveryType() {
        dto.setDeliveryType(DeliveryType.PARCEL);
        assertEquals(DeliveryType.PARCEL, dto.getDeliveryType());
    }

    @Test
    void setDate() {
        dto.setDate(new Date(150000));
        assertEquals(new Date(150000),dto.getDate());
    }

    @Test
    void setStatus() {
        dto.setStatus("COLLECTED");
        assertEquals("COLLECTED",dto.getStatus());
    }

    @Test
    void testEquals() {
        assertTrue(new Response()
                .equals(new Response())
        );

        assertTrue(dto.equals(
                new Response(
                        "deliveryId"
                        , "postOfficeId"
                        , "postOfficeName"
                        ,"postOfficeCode"
                        , "address"
                        , "currentAddress"
                        , "destinationAddress"
                        , "receiverName"
                        , "receiverIndex"
                        , false
                        , DeliveryType.POSTCARD
                        , new Date(10000)
                        , "REGISTERED"
                )
        ));
    }

    @Test
    void testToString() {

    }
}