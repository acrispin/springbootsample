/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anton.dev.sbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author anton
 */
@RestController
@EnableAutoConfiguration
public class SampleRestController {
    
    @RequestMapping("/hello")
    String hello(@RequestParam(value="user", required=true, defaultValue = "anonimo") String user) {
        return "Hola: " + user;
    }
    
    public static void main(String[] args) {
        SpringApplication.run(SampleRestController.class, args);
    }
}
