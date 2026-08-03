package com.railreserve.api.seat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class SeatService {


    private final SeatRepository repository;


    public List<Seat> findByCoach(UUID coachId) {

        return repository.findByCoachId(coachId);

    }

}