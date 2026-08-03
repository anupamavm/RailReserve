package com.railreserve.api.booking.service;

import com.railreserve.api.booking.BookingRepository;
import com.railreserve.api.booking.dto.AvailableSeatResponse;
import com.railreserve.api.seat.Seat;
import com.railreserve.api.seat.SeatRepository;
import com.railreserve.api.station.Station;
import com.railreserve.api.station.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class SeatAvailabilityService {

    private final SeatRepository seatRepository;

    private final BookingRepository bookingRepository;

    private final StationRepository stationRepository;



    public List<AvailableSeatResponse> findAvailableSeats(

            UUID originId,

            UUID destinationId

    ){


        Station origin =
                stationRepository.findById(originId)
                        .orElseThrow();


        Station destination =
                stationRepository.findById(destinationId)
                        .orElseThrow();



        List<Seat> seats =
                seatRepository.findAll();



        return seats.stream()

                .filter(seat ->

                        bookingRepository
                                .findOverlappingBookings(
                                        seat.getId(),
                                        origin.getStationOrder(),
                                        destination.getStationOrder()
                                )
                                .isEmpty()

                )

                .map(seat ->
                        new AvailableSeatResponse(

                                seat.getId(),

                                seat.getSeatNumber(),

                                seat.getCoach().getCoachNumber(),

                                seat.getCoach().getCoachType()

                        ))

                .toList();



    }

}
