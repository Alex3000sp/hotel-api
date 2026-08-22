package com.hotelapi.entity;

import com.hotelapi.common.enums.ContactType;
import jakarta.persistence.*;
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
public class ContactEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CONTACT_ID")
    @SequenceGenerator(
            name = "SQ_CONTACT_ID",
            sequenceName = "SQ_CONTACT_ID",
            allocationSize = 1
    )
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID", nullable = false)
    private HotelEntity hotelId;

    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private ContactType type;

    @Column(name = "VALUE")
    private String value;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "CHANGED_AT")
    private LocalDateTime changedAt;
}
