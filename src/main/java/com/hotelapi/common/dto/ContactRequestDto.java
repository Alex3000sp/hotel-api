package com.hotelapi.common.dto;

import com.hotelapi.common.enums.ContactType;

public record ContactRequestDto(
        ContactType type,
        String value
) {
}
