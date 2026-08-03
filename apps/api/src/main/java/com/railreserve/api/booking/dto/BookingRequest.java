package com.railreserve.api.booking.dto;


import lombok.Data;

import java.util.UUID;


@Data
public class BookingRequest {


    private UUID seatId;


    private UUID originStationId;


    private UUID destinationStationId;


}