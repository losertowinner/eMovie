package com.losertowinner.server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping
    public String Index(Model model) {
        model.addAttribute("title", "eMovie 📽️ - Admin UI");
        return "admin/index";
    }
}
