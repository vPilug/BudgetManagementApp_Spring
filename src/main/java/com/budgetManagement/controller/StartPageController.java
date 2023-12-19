package com.budgetManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartPageController {
    @RequestMapping("/home")
    public String handleRequest() {
        return "start-page";
    }
}
