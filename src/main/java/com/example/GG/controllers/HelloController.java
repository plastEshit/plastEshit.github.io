package com.example.GG.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController  {


    @RequestMapping("/inf1")
    public String inf1() {
        return "inf1";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/inf2")
    public String inf2() {
        return "inf2";
    }


    @RequestMapping("/inf3")
    public String inf3() {
        return "inf3" +
                "";
    }

    @RequestMapping("/inf4")
    public String inf4() {
        return "inf4";
    }
}


