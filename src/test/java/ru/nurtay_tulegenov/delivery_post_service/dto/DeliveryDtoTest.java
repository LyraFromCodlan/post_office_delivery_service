package ru.nurtay_tulegenov.delivery_post_service.dto;

import org.junit.jupiter.api.Test;
import ru.nurtay_tulegenov.delivery_post_service.enums.DeliveryType;
import static org.junit.Assert.*;

class DeliveryDtoTest {
    DeliveryDto dto = new DeliveryDto(
            "receiverIndex"
            , "receiverAddress"
            ,"receiverName"
            , DeliveryType.LETTER
            ,"postOfficeCode");

    @Test
    void getReceiverIndex() {
        assertEquals("receiverIndex",dto.getReceiverIndex());
    }

    @Test
    void getReceiveAddress() {
        assertEquals("receiverAddress", dto.getReceiverAddress());
    }

    @Test
    void getReceiverName() {
        assertEquals("receiverName",dto.getReceiverName());
    }

    @Test
    void getDeliveryType() {
        assertEquals(DeliveryType.LETTER, dto.getDeliveryType());
    }

    @Test
    void getPostOfficeCode() {
        assertEquals("postOfficeCode", dto.getPostOfficeCode());
    }

    @Test
    void setReceiverIndex() {
        dto.setReceiverIndex("newReceiverIndex");
        assertEquals("newReceiverIndex",dto.getReceiverIndex());
    }

    @Test
    void setReceiveAddress() {
        dto.setReceiverAddress("newReceiverAddress");
        assertEquals("newReceiverAddress", dto.getReceiverAddress());
    }

    @Test
    void setReceiverName() {
        dto.setReceiverName("newReceiverName");
        assertEquals("newReceiverName",dto.getReceiverName());
    }

    @Test
    void setDeliveryType() {
        dto.setDeliveryType(DeliveryType.PARCEL);
        assertEquals(DeliveryType.PARCEL, dto.getDeliveryType());
    }

    @Test
    void setPostOfficeCode() {
        dto.setPostOfficeCode("newPostOfficeCode");
        assertEquals("newPostOfficeCode", dto.getPostOfficeCode());
    }

    @Test
    void testEquals() {
        assertTrue(new DeliveryDto().equals(new DeliveryDto()));
        assertTrue(dto.equals(new DeliveryDto("receiverIndex", "receiverAddress","receiverName", DeliveryType.LETTER,"postOfficeCode")));
    }

    @Test
    void testToString(){
        assertEquals("DeliveryDto(receiverIndex=receiverIndex, receiverAddress=receiverAddress, receiverName=receiverName, deliveryType=LETTER, postOfficeCode=postOfficeCode)",dto.toString());
    }

}