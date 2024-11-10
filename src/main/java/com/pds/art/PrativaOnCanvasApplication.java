package com.pds.art;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class PrativaOnCanvasApplication {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @GetMapping("/paintings")
    public String paintings() {
        return "paintings";
    }

    @GetMapping("/videos")
    public String videos() {
        return "videos";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    public static void main(String[] args) {
        SpringApplication.run(PrativaOnCanvasApplication.class, args);
    }

}