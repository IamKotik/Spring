package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saurabh on 2/11/17.
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model m) {
        m.addAttribute("my_hello", "Делов А.А. приветствует вас на своей главной странице !!\"");
        return "index";
    }
}

