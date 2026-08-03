package com.railreserve.api.train;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import java.util.List;


@Service
@RequiredArgsConstructor
public class TrainService {


    private final TrainRepository repository;



    public List<Train> findAll(){

        return repository.findAll();

    }

}