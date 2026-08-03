package com.railreserve.api.route;

import com.railreserve.api.booking.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RouteRepository extends JpaRepository<Booking, UUID> {
}
