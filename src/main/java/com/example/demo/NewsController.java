package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewsController {
    @RequestMapping(value="/news.htm", method = RequestMethod.GET)
    public String My_News() {
        return "news";  //Имя страницы, которая принимает данные
    }
}

