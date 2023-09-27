package com.silasbuarque.passwordmanager.controller;

import com.silasbuarque.passwordmanager.model.PasswordGenerate;
import com.silasbuarque.passwordmanager.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PasswordController {

    @Autowired
    private PasswordService passwordService;
    @PostMapping("/generate")
    public ResponseEntity<String> generate(@RequestBody PasswordGenerate passwordGenerate){

        String password = passwordService.generate(passwordGenerate.getQtdMaxChar());

        return ResponseEntity.ok(password);
    }

}
