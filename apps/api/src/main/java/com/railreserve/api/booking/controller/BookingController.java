package com.railreserve.api.booking.controller;



import com.railreserve.api.booking.dto.BookingRequest;
import com.railreserve.api.booking.service.BookingService;
import com.railreserve.api.booking.service.SeatAvailabilityService;
import com.railreserve.api.seat.SeatRepository;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService service;

    private final SeatAvailabilityService seatAvailabilityService;

    @PostMapping
    public Object create(
            @RequestBody BookingRequest request
    ){

        return service.createBooking(request);

    }

    @GetMapping("/availability")
    public Object availability(

            @RequestParam UUID origin,

            @RequestParam UUID destination

    ){

        return seatAvailabilityService
                .findAvailableSeats(
                        origin,
                        destination
                );

    }


}