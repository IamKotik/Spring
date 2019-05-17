package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {

    @RequestMapping(value="/calc.htm", method= RequestMethod.GET)

    public String my_method(@RequestParam(value = "x", defaultValue= "0") int x,
                            @RequestParam(value = "y", defaultValue="0") int y,
                            ModelMap map){
        int d = x+y;
        map.addAttribute("sum",""+ d);
        map.addAttribute("x",""+ x);
        map.addAttribute("y",""+ y);
        return "calc";
    }
}

