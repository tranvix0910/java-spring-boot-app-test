package com.example.controller;

import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private static List<User> users = new ArrayList<>();
    
    static {
        users.add(new User(1, "Nguyễn Văn A", "nguyenvana@email.com"));
        users.add(new User(2, "Trần Thị B", "tranthib@email.com"));
        users.add(new User(3, "Lê Văn C", "levanc@email.com"));
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", users);
        return "users";
    }

    @PostMapping("/users/add")
    public String addUser(@RequestParam String name, @RequestParam String email, Model model) {
        int newId = users.size() + 1;
        users.add(new User(newId, name, email));
        model.addAttribute("users", users);
        model.addAttribute("successMessage", "Đã thêm người dùng mới thành công!");
        return "users";
    }
} 