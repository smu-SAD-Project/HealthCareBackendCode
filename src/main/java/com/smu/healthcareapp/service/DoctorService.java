package com.smu.healthcareapp.service;

import com.smu.healthcareapp.dto.DoctorDTO;

import java.util.List;

public interface DoctorService {

    List<DoctorDTO> getAllDoctors();

    Long addDoctor(DoctorDTO dr);

    DoctorDTO getDoctor(Long id);

    void deleteDoctor(Long id);
}
