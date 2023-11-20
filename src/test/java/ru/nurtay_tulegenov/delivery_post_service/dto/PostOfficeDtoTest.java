package ru.nurtay_tulegenov.delivery_post_service.dto;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class PostOfficeDtoTest {

    private PostOfficeDto dto = new PostOfficeDto(
                "name"
                ,"code"
                ,"address"
        );

    @Test
    void getName() {
        assertEquals("name", dto.getName());
    }

    @Test
    void getCode() {
        assertEquals("code", dto.getCode());
    }

    @Test
    void getAddress() {
        assertEquals("address", dto.getAddress());
    }

    @Test
    void setName() {
        this.dto.setName("newName");
        assertEquals("newName", dto.getName());
    }

    @Test
    void setCode() {
        this.dto.setCode("newCode");
        assertEquals("newCode", dto.getCode());
    }

    @Test
    void setAddress() {
        this.dto.setAddress("newAddress");
        assertEquals("newAddress", dto.getAddress());
    }

    @Test
    void testEquals() {
        assertTrue(new PostOfficeDto().equals(new PostOfficeDto()));
        assertTrue(this.dto.equals(new PostOfficeDto("name","code","address")));
    }

    @Test
    void testToString() {
        assertEquals("PostOfficeDto(name=name, code=code, address=address)", dto.toString());
    }
}