package com.railreserve.api.station;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import jakarta.persistence.LockModeType;


public interface StationRepository
        extends JpaRepository<Station, UUID> {

    List<Station> findAllByOrderByStationOrderAsc();

    List<Station> findByRouteIdOrderByStationOrder(
            UUID routeId
    );

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("""
                SELECT s
                FROM Station s
                WHERE s.id = :stationId
            """)
    Optional<Station> findByIdForUpdate(UUID stationId);

}