package com.smu.healthcareapp.mapper;

import com.smu.healthcareapp.dto.DoctorDTO;
import com.smu.healthcareapp.dto.UserDTO;
import com.smu.healthcareapp.entity.Doctor;
import com.smu.healthcareapp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "user_id", ignore = true)
    UserDTO userToUserDTO(User user);

    @Mapping(target = "user_id", ignore = true)
    User userDTOtoUser(UserDTO userDTO);
}
