package com.railreserve.api.station;

import com.railreserve.api.common.BaseEntity;
import com.railreserve.api.route.Route;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "stations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Station extends BaseEntity {


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id")
    private Route route;


    private String name;


    @Column(name = "station_order")
    private Integer stationOrder;


    @Column(name = "distance_km")
    private Integer distanceKm;

}