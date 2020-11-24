package com.conal.spotifywebserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpotifyWebServerApplication

fun main(args: Array<String>) {
	runApplication<SpotifyWebServerApplication>(*args)
}
