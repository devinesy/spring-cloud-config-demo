package org.devinesy

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@EnableAutoConfiguration
@RestController
@SpringBootApplication
class DemoConfigClientApplication {

	@Value('${config.name:World}')
	String name = 'World'

	@RequestMapping("/")
	public String home() {
		"Hello $name"
	}

	static void main(String[] args) {
		SpringApplication.run DemoConfigClientApplication, args
	}
}
