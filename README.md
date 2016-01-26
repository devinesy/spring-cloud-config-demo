demo-config
===========

Simple demo project of Spring Cloud Config. Follows directions here:
* http://cloud.spring.io/spring-cloud-config/
* http://cloud.spring.io/spring-cloud-config/spring-cloud-config.html

Comprises a @EnableConfigServer server pointing to a git repository containing Spring configuration, and a Spring Config Client resolving it's properties from the server.

TODO
* Config change push notifications (looks like it requires Redis)

Building and running from command line
---
* `./gradlew assemble` from the root directory will compile, test, and build the artifact for all projects.
* Open two terminals
* Terminal 1 `cd server`
* Terminal 1 `java -Dspring.cloud.config.server.git.username=<githubUsername> -Dspring.cloud.config.server.git.password=<githubPassword> -jar build/libs/demo-config-server-0.0.1-SNAPSHOT.jar
* Terminal 2 `cd client`
* Terminal 2 `gradle bootRun`
* In browser:
* http://localhost:8888/config-client//master  shows all properties from the properties file config-client in the git repo
* http://localhost:8080/  says hello world with property sourced from the config server
