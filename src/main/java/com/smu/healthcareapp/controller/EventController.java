package com.smu.healthcareapp.controller;

import com.smu.healthcareapp.dto.DoctorDTO;
import com.smu.healthcareapp.dto.EventDTO;
import com.smu.healthcareapp.service.EventService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/events")
public class EventController {

    private EventService eventService;

    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public long addEvent(@RequestBody EventDTO eventDTO){
       return eventService.addEvent(eventDTO);
    }

    @GetMapping("/{eventId}")
    @ResponseStatus(HttpStatus.OK)
    public EventDTO getEvent(@PathVariable Long eventId){ return eventService.getEvent(eventId); }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EventDTO> getEvents() {
        return eventService.getAllEvents();
    }

}
