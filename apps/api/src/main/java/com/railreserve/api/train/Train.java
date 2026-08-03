package com.railreserve.api.train;

import com.railreserve.api.coach.Coach;
import com.railreserve.api.common.BaseEntity;
import com.railreserve.api.route.Route;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "trains")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Train extends BaseEntity {


    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id")
    private Route route;


    @OneToMany(
            mappedBy = "train",
            cascade = CascadeType.ALL
    )
    private List<Coach> coaches;

}