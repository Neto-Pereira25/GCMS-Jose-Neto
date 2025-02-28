package br.edu.ifpe.recife.gcms.joseneto.WebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, Worldv!";
    }

    @RequestMapping("/neto")
    public @ResponseBody String greetingNeto() {
        return "Hello, Neto!";
    }

    @RequestMapping("/pereira")
    public @ResponseBody String greetingPereira() {
        return "Hello, Pereira!";
    }

    @RequestMapping("/jose")
    public @ResponseBody String greetingJose() {
        return "Hello, Jose!";

    }

    @RequestMapping("/hotfix")
    public @ResponseBody String greetingHotfix() {
        return "Jose Hotfix!";
    }
}
