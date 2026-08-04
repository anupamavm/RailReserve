package com.railreserve.api.booking;

import com.railreserve.api.booking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;


public interface BookingRepository extends JpaRepository<Booking, UUID> {

    @Query("""
            SELECT b
            FROM Booking b
            
            WHERE b.seat.id = :seatId
            
            AND b.status = 'CONFIRMED'
            
            AND b.startOrder < :endOrder
            
            AND b.endOrder > :startOrder
            
            """)
    List<Booking> findOverlappingBookings(

            UUID seatId,

            Integer startOrder,

            Integer endOrder

    );
}
