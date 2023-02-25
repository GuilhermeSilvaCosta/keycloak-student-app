package com.guilherme.studentapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ManageStudentsController {
    
    @PreAuthorize("hasAuthority('PROFESSOR')")
    @GetMapping("/manage-students")
    public ModelAndView getManageStudens() {
        ModelAndView modelAndView = new ModelAndView("manage-students");
        return modelAndView;
    }
}
