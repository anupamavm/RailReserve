package com.railreserve.api.coach;

import com.railreserve.api.common.BaseEntity;
import com.railreserve.api.seat.Seat;
import com.railreserve.api.train.Train;
import jakarta.persistence.*;

import lombok.*;

import java.util.List;


@Entity
@Table(name="coaches")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coach extends BaseEntity {


    private Integer coachNumber;



    @Column(name="coach_type")
    private String coachType;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="train_id")
    private Train train;



    @OneToMany(
            mappedBy="coach",
            cascade=CascadeType.ALL
    )
    private List<Seat> seats;

}