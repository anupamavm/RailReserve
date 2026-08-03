package com.railreserve.api.route;

import com.railreserve.api.common.BaseEntity;
import com.railreserve.api.station.Station;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "routes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Route extends BaseEntity {


    @Column(nullable = false)
    private String name;


    private boolean active = true;


    @OneToMany(
            mappedBy = "route",
            cascade = CascadeType.ALL
    )
    private List<Station> stations;

}
