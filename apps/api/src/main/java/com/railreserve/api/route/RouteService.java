package com.railreserve.api.route;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import java.util.List;


@Service
@RequiredArgsConstructor
public class RouteService {


    private final RouteRepository routeRepository;


    public List<Route> findAll(){

        return routeRepository.findAll();

    }


}
