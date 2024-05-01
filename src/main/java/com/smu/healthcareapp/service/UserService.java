package com.smu.healthcareapp.service;

import com.smu.healthcareapp.dto.UserDTO;

public interface UserService {

    UserDTO getUser(Long userId);

    long addUser(UserDTO user);
}
