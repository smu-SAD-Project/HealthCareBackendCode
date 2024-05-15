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
public class DoctorDTO {

    public Long id;

    //fname, lname, phone, email, address, speciality, description

    public String fname;
    public String lname;
    public String phone;
    public String email;
    public String address;
    public String speciality;
    public String description;

}
