package com.railreserve.api.station;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StationControllerTest {

    @Autowired
    private StationController stationController;

    @Test
    void getStationsReturnsStations() {
        List<StationResponse> stations = stationController.getStations();

        assertFalse(stations.isEmpty());
        assertTrue(stations.stream().anyMatch(station -> "Colombo Fort".equals(station.name())));
    }
}
