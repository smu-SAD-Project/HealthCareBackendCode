package com.smu.healthcareapp.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EventDTO {
    public Long eventId;
    public Long userId;
    public String startDate;
    public String endDate;
    public String notes;
}
