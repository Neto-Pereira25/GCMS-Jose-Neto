package br.edu.ifpe.recife.gcms.joseneto.WebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World!";
    }

    @RequestMapping("/neto")
    public @ResponseBody String greetingFulano() {
        return "Hello, Neto!";
    }
}
