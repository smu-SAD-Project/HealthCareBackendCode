package com.smu.healthcareapp.service;

import com.smu.healthcareapp.dto.EventDTO;

import java.util.List;

public interface EventService {

    long addEvent(EventDTO eventDTO);

    EventDTO getEvent(Long eventId);

    List<EventDTO> getAllEvents();

    void deleteEvent(Long eventId);
}
