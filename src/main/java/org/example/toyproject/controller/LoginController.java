package org.example.toyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String showLoginPage() {
        return "sign-in";  // templates/sign-in.html
    }

    @GetMapping("/sign-up")
    public String showSignUpPage() {
        return "sign-up";  // 아직 없지만 추후 생성
    }

    @GetMapping("/email-login")
    public String showEmailLoginPage() {
        return "email-login";  // 아직 없지만 추후 생성
    }
}
