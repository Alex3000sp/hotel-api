package com.hotelapi.common.dto;

import com.hotelapi.common.enums.AddressType;

import java.time.LocalDateTime;

public record AddressResponseDto(
        Long id,
        AddressType type,
        String country,
        String region,
        String district,
        String settlement,
        String building,
        String flat,
        LocalDateTime createdAt,
        LocalDateTime changedAt
) {
}
