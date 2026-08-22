package com.hotelapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "HOTELS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_HOTEL_ID")
    @SequenceGenerator(
            name = "SQ_HOTEL_ID",
            sequenceName = "SQ_HOTEL_ID",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NUMBER_OF_ROOMS")
    private Integer numberOfRooms;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "CHANGED_AT")
    private LocalDateTime changedAt;

    @OneToMany(mappedBy = "hotelId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ContactEntity> contactsEntityList;

    @OneToMany(mappedBy = "hotelId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AddressEntity> addressEntityList;
}
