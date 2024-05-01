package com.smu.healthcareapp.repository;

import com.smu.healthcareapp.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
