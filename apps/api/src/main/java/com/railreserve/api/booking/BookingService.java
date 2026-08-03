package com.railreserve.api.booking;


import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class BookingService {


    private final BookingRepository repository;


}