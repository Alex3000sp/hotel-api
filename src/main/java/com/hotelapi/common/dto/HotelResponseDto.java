package com.hotelapi.common.dto;

import java.time.LocalDateTime;
import java.util.List;

public record HotelResponseDto(
        Long id,
        String name,
        Integer numberOfRooms,
        LocalDateTime createdAt,
        LocalDateTime changedAt,
        List<ContactResponseDto> contacts,
        List<AddressResponseDto> addresses
) {
}
