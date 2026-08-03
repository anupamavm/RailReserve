package com.railreserve.api.booking;

import com.railreserve.api.common.BaseEntity;
import com.railreserve.api.seat.Seat;
import com.railreserve.api.station.Station;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@Table(name = "bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseEntity {


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_id")
    private Seat seat;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "origin_station_id")
    private Station originStation;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "destination_station_id")
    private Station destinationStation;


    @Column(nullable = false)
    private Integer startOrder;


    @Column(nullable = false)
    private Integer endOrder;


    private BigDecimal fare;


    private String status;

}
