package com.hotelapi.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "CONTACTS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ADDRESS_ID")
    @SequenceGenerator(
            name = "SQ_ADDRESS_ID",
            sequenceName = "SQ_ADDRESS_ID",
            allocationSize = 1
    )
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID", nullable = false)
    private HotelEntity hotelId;

    @Column ( name = "TYPE")
    private Integer type;

    @Column ( name = "COUNTRY")
    private Integer country;

    @Column ( name = "REGION")
    private String region;

    @Column ( name = "DISTRICT")
    private String district;

    @Column ( name = "SETTLEMENT")
    private String settlement;

    @Column ( name = "BUILDING")
    private String building;

    @Column ( name = "FLAT")
    private String flat;

    @Column ( name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column ( name = "CHANGED_AT")
    private LocalDateTime changedAt;
}
