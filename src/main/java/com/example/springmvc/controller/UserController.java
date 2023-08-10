package com.example.springmvc.controller;



import com.example.springmvc.dto.UserLoginRequest;
import com.example.springmvc.dto.UserLoginResponse;
import com.example.springmvc.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public ModelAndView login(HttpServletRequest request,@ModelAttribute("user")UserLoginRequest userLoginRequest){
    	HttpSession session =request.getSession(); 
        userService.doThing();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName", userLoginRequest.getUserName());
        modelAndView.addObject("password", userLoginRequest.getPassword());
        modelAndView.addObject("sessionId", session.getId());
        modelAndView.setViewName("userPerfile"); // 設置視圖名稱，這裡假設是 "userPerfile.jsp"
        return  modelAndView;
    }
    
    @PostMapping("/Jsonlogin")
    public UserLoginResponse loginJson(@ModelAttribute("user")UserLoginRequest userLoginRequest){
    	UserLoginResponse userLoginResponse =new UserLoginResponse();
    	userLoginResponse.setUserName(userLoginRequest.getUserName());
    	userLoginResponse.setUserPassword(userLoginRequest.getPassword()); 
        return  userLoginResponse;
    }
    

}
