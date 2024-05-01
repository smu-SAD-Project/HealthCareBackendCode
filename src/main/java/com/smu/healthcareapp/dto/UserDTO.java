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
public class UserDTO {
    public Long user_id;
    public Long id;
    public String fname ;
    public String lname ;
    public String phone;
    public String email;
    public String password;
    public String diseases ;
}
