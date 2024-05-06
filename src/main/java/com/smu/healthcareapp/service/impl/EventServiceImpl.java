package com.smu.healthcareapp.service.impl;

import com.smu.healthcareapp.dto.EventDTO;
import com.smu.healthcareapp.entity.Doctor;
import com.smu.healthcareapp.entity.Event;
import com.smu.healthcareapp.mapper.EventMapper;
import com.smu.healthcareapp.repository.EventRepository;
import com.smu.healthcareapp.repository.UserRepository;
import com.smu.healthcareapp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    private final EventMapper eventMapper;

    @Autowired
    public  EventServiceImpl(EventRepository eventRepository, EventMapper eventMapper){
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }

    @Override
    public long addEvent(EventDTO eventDTO) {
        Event event = eventRepository.save(eventMapper.eventDTOtoEvent(eventDTO));
        return event.getEventId();
    }

    @Override
    @Transactional(readOnly = true)
    public EventDTO getEvent(Long eventId) {
        Event event = eventRepository.getById(eventId);
        return eventMapper.eventToEventDTO(event);
    }

    @Override
    public List<EventDTO> getAllEvents() {

        List<Event> events = eventRepository.findAll();
        return eventMapper.eventsToEventDTO(events);

    }
}
