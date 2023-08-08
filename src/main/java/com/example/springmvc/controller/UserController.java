package com.example.springmvc.controller;



import com.example.springmvc.dto.UserLoginRequest;
import com.example.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public ModelAndView helloWorld(@ModelAttribute("user")UserLoginRequest userLoginRequest){

        userService.doThing();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName", userLoginRequest.getUserName());
        modelAndView.addObject("password", userLoginRequest.getPassword());
        modelAndView.setViewName("userPerfile"); // 設置視圖名稱，這裡假設是 "helloView.jsp"
        return  modelAndView;
    }

}
