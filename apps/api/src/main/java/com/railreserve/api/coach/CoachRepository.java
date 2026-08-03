package com.railreserve.api.coach;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CoachRepository extends JpaRepository<Coach, UUID> {
    List<Coach> findByTrainId(UUID trainId);
}
