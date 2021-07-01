package com.child.child.controller;

import com.child.child.service.DummyService;
import com.childcore.core.model.DummyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class DummyController {
    @Autowired
    DummyService dummyService;

    @GetMapping(value = "/dummy")
    public ResponseEntity<DummyDto> getDummy()
    {
        DummyDto dummyDto = dummyService.getDummy();
        return new ResponseEntity<>(dummyDto, HttpStatus.OK);
    }


}
