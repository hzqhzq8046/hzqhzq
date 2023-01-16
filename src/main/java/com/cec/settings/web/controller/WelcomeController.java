package com.cec.settings.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public String welcome() {
        return "redirect:/pages/login.html";
    }
}
