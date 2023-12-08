package com.example.registrationLogin.security;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration

public class PasswordEncoder {

    public BCryptPasswordEncoder bCryptPasswordEncoder;
}
