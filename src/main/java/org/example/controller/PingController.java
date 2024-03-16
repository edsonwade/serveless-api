package org.example.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(path = "/ping")
@EnableWebMvc
public class PingController {
    @GetMapping
    public ResponseEntity<Map<String, String>> ping() {
        Map<String, String> pong = new HashMap<>();
        pong.put("pong", "Hello, World!");
        return ResponseEntity.ok().body(pong);
    }
}
