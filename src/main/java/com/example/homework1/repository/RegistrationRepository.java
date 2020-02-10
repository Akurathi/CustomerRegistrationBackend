package com.example.homework1.repository;

import com.example.homework1.model.LoginDetails;
//import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationRepository extends CrudRepository<LoginDetails, Long> {

//    public List<LoginDetails> findAll();


}
