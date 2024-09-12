package com.jurist101.webservice.services;

import com.jurist101.webservice.models.User;
import com.jurist101.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        BCryptPasswordEncoder encript = new BCryptPasswordEncoder();
        user.setPassword(encript.encode(user.getPassword()));
        user.setAuth_key("");
        user.setConfirmed_at(0);
        user.setUnconfirmed_email("");
        user.setBlocked_at(0);
        user.setRegistration_ip("");
        user.setCreated_at(new Timestamp(System.currentTimeMillis()));
        user.setUpdated_at(new Timestamp(System.currentTimeMillis()));
        user.setFlags(1);
        user.setLast_login_at(new Timestamp(System.currentTimeMillis()));
        return userRepository.save(user);
    }

}
