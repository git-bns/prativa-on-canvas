package com.pds.art;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@SpringBootApplication
public class PrativaOnCanvasApplication {

    @GetMapping("/")
    public String index() {
	System.out.println("English | Website visited by user.");
        return "index";
    }

    @GetMapping("/home")
    public String home() {
	System.out.println("English | Homepage visited.");
        return "index";
    }

    @GetMapping("/paintings")
    public String paintings() {
	System.out.println("English | My paintings being viewed.");
        return "paintings";
    }

    @GetMapping("/videos")
    public String videos() {
	System.out.println("English | My videos being surfed.");
        return "videos";
    }

    @GetMapping("/contact")
    public String contact() {
	System.out.println("English | User looking to connect.");
        return "contact";
    }

    @PostMapping("/connect")
    public String connect() {
	System.out.println("English | User sent a query.");
        return "connect";
    }

    @GetMapping("/bn")
    public String indexBn() {
	System.out.println("Bengali | Website visited by user.");
        return "bn/index";
    }

    @GetMapping("/bn/home")
    public String homeBn() {
	System.out.println("Bengali | Homepage visited.");
        return "bn/index";
    }

    @GetMapping("/bn/paintings")
    public String paintingsBn() {
	System.out.println("Bengali | My paintings being viewed.");
        return "bn/paintings";
    }

    @GetMapping("/bn/videos")
    public String videosBn() {
	System.out.println("Bengali | My videos being surfed.");
        return "bn/videos";
    }

    @GetMapping("/bn/contact")
    public String contactBn() {
	System.out.println("Bengali | User looking to connect.");
        return "bn/contact";
    }

    @PostMapping("/bn/connect")
    public String connectBn() {
	System.out.println("Bengali | User sent a query.");
        return "bn/connect";
    }

    public static void main(String[] args) {
        SpringApplication.run(PrativaOnCanvasApplication.class, args);
    }

}