package com.smu.healthcareapp.service.impl;

import com.smu.healthcareapp.dto.UserDTO;
import com.smu.healthcareapp.entity.User;
import com.smu.healthcareapp.mapper.UserMapper;
import com.smu.healthcareapp.repository.UserRepository;
import com.smu.healthcareapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                             UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }



    @Override
    @Transactional(readOnly = true)
    public UserDTO getUser(Long userId) {
       User user = userRepository.getById(userId);
        return userMapper.userToUserDTO(user);

    }

    @Override
    public long addUser(UserDTO userDTO) {
        User user = userRepository.save(userMapper.userDTOtoUser(userDTO));
        return user.getUser_id();
    }
}
