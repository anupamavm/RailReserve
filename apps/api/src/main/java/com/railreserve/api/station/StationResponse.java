package com.railreserve.api.station;

import java.util.UUID;

public record StationResponse(
        UUID id,
        String name,
        Integer stationOrder,
        Integer distanceKm
) {
    public static StationResponse from(Station station) {
        return new StationResponse(
                station.getId(),
                station.getName(),
                station.getStationOrder(),
                station.getDistanceKm()
        );
    }
}
