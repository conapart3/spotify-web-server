package com.conal.spotifywebserver.com.conal.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController{

    @GetMapping("/healthCheck")
    fun healthCheck() : String {
        return "healthy"
    }
}