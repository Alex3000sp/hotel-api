package com.hotelapi.common.dto;

public record HotelRequestDto(
        String hotelName,
        Integer numberOfRooms
) {
}
