package com.example.homework1.controller;

import com.example.homework1.model.LoginDetails;
import com.example.homework1.model.UserDetails;
import com.example.homework1.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@RestController
@Validated
public class RegistrationRequestController {

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/login", produces = "application/json")
    @CrossOrigin(origins = "*")
    public String LoginValidationController(@RequestParam(required = true) @NotBlank String username, @RequestParam(required = true) @NotBlank String password){

//        LoginDetails login = new LoginDetails(username,password);
        return loginService.LoginValidationService(username,password);
    }

    @PostMapping(value = "/", produces = "application/json")
    @CrossOrigin(origins = "*")
    public UserDetails registerUser(@RequestParam(defaultValue="test") @NotBlank String username, @RequestParam(defaultValue="test") @NotBlank String password, @RequestParam(defaultValue="test@gmail.com") @NotBlank String email)
    {
        LoginDetails registration = new LoginDetails(username, password, email);
        return loginService.registrationService(registration );
    }

    @GetMapping(value = "/getAll", produces = "application/json")
    @CrossOrigin(origins = "*")
    public List<LoginDetails> getAll(){
        return loginService.getAll();
    }


}
