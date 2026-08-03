package com.railreserve.api.coach;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class CoachService {

    private final CoachRepository repository;

    public List<Coach> findByTrain(UUID trainId) {

        return repository.findByTrainId(trainId);

    }

}