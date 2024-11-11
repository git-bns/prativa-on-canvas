package com.pds.art;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrativaOnCanvasHealthController {

    @GetMapping("/health")
    public String health() {
	System.out.println("Service pod is healthy!");
        return "Hello, service pod is healthy!";
    }

    @GetMapping("/ready")
    public String ready() {
	System.out.println("Service pod is ready!");
        return "Hello, service pod is ready!";
    }

}
