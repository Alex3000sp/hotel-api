package com.hotelapi;

import org.springframework.boot.SpringApplication;

public class TestHotelApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(HotelApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
