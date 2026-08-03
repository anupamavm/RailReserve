package com.railreserve.api.common;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;


@Getter
@MappedSuperclass
public abstract class BaseEntity {


    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid")
    private UUID id;


    @Column(
            name = "created_at",
            nullable = false,
            updatable = false
    )
    private Instant createdAt;


    @PrePersist
    protected void onCreate(){

        createdAt = Instant.now();

    }

}