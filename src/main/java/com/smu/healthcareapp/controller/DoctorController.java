package com.smu.healthcareapp.controller;

import com.smu.healthcareapp.dto.DoctorDTO;
import com.smu.healthcareapp.service.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/doctors")
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DoctorDTO> getDoctors() {
        return doctorService.getAllDoctors();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public long addDoctor(@RequestBody DoctorDTO dr) {
        return  doctorService.addDoctor(dr);
    }
}
