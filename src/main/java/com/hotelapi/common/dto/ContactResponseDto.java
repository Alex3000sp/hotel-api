package com.hotelapi.common.dto;

import com.hotelapi.common.enums.ContactType;

import java.time.LocalDateTime;

public record ContactResponseDto(
        Long id,
        ContactType type,
        String value,
        LocalDateTime createdAt,
        LocalDateTime changedAt
) {
}
