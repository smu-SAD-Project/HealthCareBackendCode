package com.smu.healthcareapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DoctorDTO {
    public Long id;
    public String name;
    public String image;
    public String specialisedArea;
    public String rating;
    public String distance;
}
