package com.railreserve.api.coach;

import com.railreserve.api.booking.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CoachRepository extends JpaRepository<Booking, UUID> {
}
