package com.example.registrationLogin.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
//path?!
@AllArgsConstructor
public class RegistrationController {

    public  String registration (@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }
}
