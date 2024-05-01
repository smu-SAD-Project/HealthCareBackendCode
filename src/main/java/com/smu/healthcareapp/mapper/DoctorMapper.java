package com.smu.healthcareapp.mapper;

import com.smu.healthcareapp.dto.DoctorDTO;
import com.smu.healthcareapp.entity.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

   List<DoctorDTO> doctorsToDoctorDTO(List<Doctor> doctors);

   @Mapping(target = "id", ignore = true)
   Doctor doctorDTOtoDoctor(DoctorDTO doctorDTO);
}
