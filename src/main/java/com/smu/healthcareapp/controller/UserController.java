package com.smu.healthcareapp.controller;

import com.smu.healthcareapp.dto.UserDTO;
import com.smu.healthcareapp.service.DoctorService;
import com.smu.healthcareapp.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getUser(@PathVariable("userId") Long userId){
        return userService.getUser(userId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public long addUser(@RequestBody UserDTO user){
        return userService.addUser(user);
    }

}
