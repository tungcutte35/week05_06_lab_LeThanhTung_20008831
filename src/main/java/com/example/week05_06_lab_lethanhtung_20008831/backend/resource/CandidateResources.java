package com.example.week05_06_lab_lethanhtung_20008831.backend.resource;

import com.example.week05_06_lab_lethanhtung_20008831.backend.services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/${app.rest.path}")
public class CandidateResources {
    @Autowired
    private CandidateServices services;
//    @GetMapping(path = "/candidate")
//    public String beat(){
//        return "OK ưef";
//    }

}
