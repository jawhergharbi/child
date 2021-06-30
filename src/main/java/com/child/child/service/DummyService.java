package com.child.child.service;

import com.childcore.core.model.DummyDto;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public DummyDto getDummy(){

        return new DummyDto("dummy",8);
    }
}
