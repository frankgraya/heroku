package com.example.demo.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class HomeController {

    //GET EXEMPLO: SERVER/INDEX
    @GetMapping("/")
    public String index() {
        log.info("ESTAS EN INDEX EJEMPLOS GET ");
        return "home";
    }

}
