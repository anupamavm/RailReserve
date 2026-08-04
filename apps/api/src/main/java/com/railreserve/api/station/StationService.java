package com.railreserve.api.station;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class StationService {


    private final StationRepository repository;


    public List<Station> getStations() {

        return repository
                .findAllByOrderByStationOrderAsc();

    }

}