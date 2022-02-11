package com.projects.youresume.controller;

import com.projects.youresume.dao_imp.UserDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class UserController {
//    private UserDAOImpl userDAO;
//
//    public UserController(UserDAOImpl userDAO) {
//        this.userDAO = userDAO;
//    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/hello")
    public ModelAndView welcomePage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        mav.addObject("name","Elgun");
        return mav;

    }

//    @PostMapping("/hello")
//    public ModelAndView doAction(
//            @RequestParam String choice
//    ) {
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("showEmployees");
//        if (choice.equals("showAll")) {
//            mav.addObject("employees", userDAO.getAllUsers());
//        }
//        return mav;
//    }
}
