package org.devinesy

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class DemoConfigServerApplication {

  static void main(String[] args) {
    SpringApplication.run DemoConfigServerApplication, args
  }
}
