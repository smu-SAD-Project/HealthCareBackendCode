package com.smu.healthcareapp.service.impl;

import com.smu.healthcareapp.dto.DoctorDTO;
import com.smu.healthcareapp.entity.Doctor;
import com.smu.healthcareapp.mapper.DoctorMapper;
import com.smu.healthcareapp.repository.DoctorRepository;
import com.smu.healthcareapp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;
    @Autowired
    public DoctorServiceImpl(DoctorRepository doctorRepository,
                             DoctorMapper doctorMapper) {
        this.doctorRepository = doctorRepository;
        this.doctorMapper = doctorMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<DoctorDTO> getAllDoctors() {
        List<Doctor> doctors = doctorRepository.findAll();
        return doctorMapper.doctorsToDoctorDTO(doctors);
    }

    @Override
    @Transactional
    public Long addDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = doctorRepository.save(doctorMapper.doctorDTOtoDoctor(doctorDTO));
        return doctor.getId();
    }
}
