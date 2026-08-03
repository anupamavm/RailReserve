package com.railreserve.api.seat;

import com.railreserve.api.coach.Coach;
import com.railreserve.api.common.BaseEntity;
import jakarta.persistence.*;

import lombok.*;


@Entity
@Table(name="seats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seat extends BaseEntity {


    @Column(name="seat_number")
    private String seatNumber;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="coach_id")
    private Coach coach;

}