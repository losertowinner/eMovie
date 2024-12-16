package com.losertowinner.server.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @GetMapping
    public String getAllMovies() {
      return "Movies";
    }
}
