package com.smu.healthcareapp.service;

import com.smu.healthcareapp.dto.EventDTO;

public interface EventService {

    long addEvent(EventDTO eventDTO);

    EventDTO getEvent(Long eventId);
}
