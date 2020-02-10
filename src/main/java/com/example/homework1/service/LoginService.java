package com.example.homework1.service;

import com.example.homework1.model.LoginDetails;
import com.example.homework1.model.UserDetails;
import com.example.homework1.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private RegistrationRepository dbRepository;

    public String LoginValidationService(String username, String password){
        System.out.println("inside service");
        List<LoginDetails> getAllUserDetails = this.getAll();
        Boolean isAvailable = false;
        System.out.println(getAllUserDetails);
        for(LoginDetails details : getAllUserDetails){
            if(details.getUserName().equals(username) && details.getPassword().equals(password)) {
                isAvailable = true;
                break;
            }
        }
        System.out.println("isAvailable "+ isAvailable);
        if(isAvailable) {
//            dbRepository.save(loginDetails);
            return "Login success";
        }
        return "not available";
    }

    public List<LoginDetails> getAll() {

        System.out.println("inside the getall service");

        return (List<LoginDetails>) dbRepository.findAll();
    }

    public UserDetails registrationService(LoginDetails loginDetails){
        List<LoginDetails> allUsers = this.getAll();
        UserDetails userDetails = new UserDetails();

        Boolean isAvailable = false;
        System.out.println(allUsers);
        for(LoginDetails details : allUsers){
            if(details.getUserName().equals(loginDetails.getUserName()) && details.getPassword().equals(loginDetails.getPassword())) {
                isAvailable = true;
                break;
            }
        }
        System.out.println("isAvailabl e"+ isAvailable);

        if(!isAvailable) {

            LoginDetails res = dbRepository.save(loginDetails);



            userDetails.setUserName(res.getUserName());

            userDetails.setEmail(res.getEmail());

            userDetails.setId(res.getId());

            userDetails.setStatus("successful");

           // return "successful";

            return userDetails;

        }

        userDetails.setStatus("UserAvailable");
        //return "UserAvailable";
        return userDetails;
    }
}
