package org.devinesy

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.annotation.PostConstruct

@Configuration
@EnableAutoConfiguration
@RestController
@SpringBootApplication
@Slf4j
class DemoConfigClientApplication {

  @Value('${config.name:World}')
  String name = 'World'

  @PostConstruct
  void postConstruct() {
    log.info("****** PostConstruct name = $name")
  }

  @RequestMapping("/")
  public String home() {
    "Hello $name"
  }

  static void main(String[] args) {
    SpringApplication.run DemoConfigClientApplication, args
  }
}
