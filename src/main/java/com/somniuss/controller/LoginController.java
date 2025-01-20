package com.somniuss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String showLoginPage() {
        System.out.println("Login page accessed");  // Лог в консоль
        return "login";  // Возвращаем имя шаблона
    }

    @PostMapping("/")
    public String handleLogin(@RequestParam String login, @RequestParam String password) {
        System.out.println("Login attempt: " + login + " with password: " + password);
        // Добавьте логику для аутентификации
        return "login";  // Возвращаем имя шаблона, если аутентификация успешна
    }
}
