package com.railreserve.api.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;


@Data
@AllArgsConstructor
public class AvailableSeatResponse {


    private UUID seatId;


    private String seatNumber;


    private Integer coachNumber;


    private String coachType;

}