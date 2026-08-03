package com.railreserve.api.booking.service;



import com.railreserve.api.station.Station;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;



@Service
public class FareService {


    private static final BigDecimal RATE =
            BigDecimal.valueOf(2.5);



    public BigDecimal calculate(

            Station origin,

            Station destination

    ){


        int distance =
                destination.getDistanceKm()
                        -
                        origin.getDistanceKm();



        return BigDecimal.valueOf(distance)
                .multiply(RATE);



    }


}