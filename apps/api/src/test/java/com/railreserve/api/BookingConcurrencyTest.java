package com.railreserve.api;

import com.railreserve.api.booking.service.BookingService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootTest
class BookingConcurrencyTest {

    private final BookingService bookingService;

    @Test
    void shouldAllowOnlyOneBooking(){

        ExecutorService executor =
                Executors.newFixedThreadPool(2);



        executor.submit(() ->
                bookingService.createBooking(request)
        );


        executor.submit(() ->
                bookingService.createBooking(request)
        );


    }

}