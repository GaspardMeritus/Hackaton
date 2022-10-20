package com.demo.controller;

import com.demo.entity.LoginEntity;
import com.demo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

   /* @PostMapping("/api/login")
    public LoginEntity getLoginById(@RequestBody LoginEntity loginEntity) {

      *//*  LoginEntity loginEntityFromDb = loginRepository.getById(loginEntity.getLoginId());
        if (loginEntity.getLoginId().equals(loginEntityFromDb.getLoginId())
                && loginEntity.getLoginPassword().equals(loginEntityFromDb.getLoginPassword())) {
            loginEntityFromDb.setLoginPassword(" ");
            return loginEntityFromDb;
        }
        return new LoginEntity();
    }*/

}



