package com.smu.healthcareapp.mapper;

import com.smu.healthcareapp.dto.EventDTO;
import com.smu.healthcareapp.dto.UserDTO;
import com.smu.healthcareapp.entity.Event;
import com.smu.healthcareapp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EventMapper {
    @Mapping(target = "eventId", ignore = true)
    EventDTO eventToEventDTO(Event event);

    @Mapping(target = "eventId", ignore = true)
    Event eventDTOtoEvent(EventDTO eventDTO);

}
