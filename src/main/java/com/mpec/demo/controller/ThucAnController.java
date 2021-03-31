package com.mpec.demo.controller;

import com.mpec.demo.entity.ThucAn;
import com.mpec.demo.repository.ThucAnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ThucAnController {

    @Autowired
    private ThucAnRepo thucAnRepo;

    @RequestMapping("/find-all")
    ResponseEntity<List<ThucAn>> hello(){
        List<ThucAn> thucAns=thucAnRepo.findAll();
    return new ResponseEntity<>(thucAns, HttpStatus.OK);
    }

    @RequestMapping("/find-by-id")
    ResponseEntity<ThucAn> findbyid(@RequestParam("id") Integer id){
        ThucAn thucAns=thucAnRepo.findById(id);
        return new ResponseEntity<>(thucAns, HttpStatus.OK);
    }
}
