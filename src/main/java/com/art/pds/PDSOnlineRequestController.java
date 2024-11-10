package com.art.pds;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PDSOnlineRequestController {

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
}
