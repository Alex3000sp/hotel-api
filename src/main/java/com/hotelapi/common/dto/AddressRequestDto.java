package com.hotelapi.common.dto;

import com.hotelapi.common.enums.AddressType;

public record AddressRequestDto(
        AddressType type,
        String country,
        String region,
        String district,
        String settlement,
        String building,
        String flat
) {
}
