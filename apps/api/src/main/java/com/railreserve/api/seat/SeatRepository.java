package com.railreserve.api.seat;


import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface SeatRepository extends JpaRepository<Seat, UUID> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("""
                SELECT s
                FROM Seat s
                WHERE s.id = :seatId
            """)
    Seat findByIdForUpdate(UUID seatId);


    List<Seat> findByCoachId(UUID coachId);
}
