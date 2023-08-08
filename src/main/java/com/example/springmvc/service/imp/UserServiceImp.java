package com.example.springmvc.service.imp;

import com.example.springmvc.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Override
    public void doThing() {
        System.out.println("執行東西");
    }
}
