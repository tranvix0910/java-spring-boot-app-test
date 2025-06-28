package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("currentTime", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        model.addAttribute("message", "Chào mừng bạn đến với ứng dụng Java Web!");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Giới thiệu");
        model.addAttribute("description", "Đây là một ứng dụng web Java đơn giản được xây dựng bằng Spring Boot.");
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @PostMapping("/contact")
    public String submitContact(@RequestParam String name, 
                              @RequestParam String email, 
                              @RequestParam String message, 
                              Model model) {
        model.addAttribute("successMessage", "Cảm ơn " + name + "! Chúng tôi đã nhận được tin nhắn của bạn.");
        return "contact";
    }
} 