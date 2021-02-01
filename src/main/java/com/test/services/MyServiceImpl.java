package com.test.services;

import com.test.model.MyObject;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public MyObject getMyObject() {
        return new MyObject("Test Name", 25);
    }
}
