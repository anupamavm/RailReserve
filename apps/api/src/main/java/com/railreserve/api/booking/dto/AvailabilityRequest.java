package com.railreserve.api.booking.dto;


import lombok.Data;

import java.util.UUID;


@Data
public class AvailabilityRequest {


    private UUID originStationId;


    private UUID destinationStationId;

}