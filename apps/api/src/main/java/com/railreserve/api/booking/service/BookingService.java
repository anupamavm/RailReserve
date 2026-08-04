package com.railreserve.api.booking.service;


import com.railreserve.api.booking.entity.Booking;
import com.railreserve.api.booking.BookingRepository;
import com.railreserve.api.booking.dto.BookingRequest;
import com.railreserve.api.booking.entity.BookingStatus;
import com.railreserve.api.seat.SeatRepository;
import com.railreserve.api.station.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class BookingService {


    private final BookingRepository bookingRepository;

    private final SeatRepository seatRepository;

    private final StationRepository stationRepository;

    private final FareService fareService;


    @Transactional
    public Booking createBooking(

            BookingRequest request

    ) {


        var seat =
                seatRepository.findByIdForUpdate(
                        request.getSeatId()
                );


        var origin =
                stationRepository.findByIdForUpdate(
                                request.getOriginStationId()
                        )
                        .orElseThrow();


        var destination =
                stationRepository.findById(
                                request.getDestinationStationId()
                        )
                        .orElseThrow();


        var conflicts =
                bookingRepository.findOverlappingBookings(

                        seat.getId(),

                        origin.getStationOrder(),

                        destination.getStationOrder()

                );


        if (!conflicts.isEmpty()) {

            throw new RuntimeException(
                    "Seat already booked"
            );

        }


        Booking booking = new Booking();


        booking.setSeat(seat);

        booking.setOriginStation(origin);

        booking.setDestinationStation(destination);


        booking.setStartOrder(
                origin.getStationOrder()
        );


        booking.setEndOrder(
                destination.getStationOrder()
        );


        booking.setFare(
                fareService.calculate(
                        origin,
                        destination
                )
        );


        booking.setStatus(
                BookingStatus.CONFIRMED
        );


        return bookingRepository.save(booking);


    }


}