package com.railreserve.api.station;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class StationService {


    private final StationRepository repository;


    public List<Station> getStations(UUID routeId) {

        return repository
                .findByRouteIdOrderByStationOrder(routeId);

    }

}