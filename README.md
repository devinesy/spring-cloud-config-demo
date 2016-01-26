demo-config
===========

Demo project of Spring Cloud Config

Building and running from command line
---
* `./gradlew assemble` from the root directory will compile, test, and build the artifact for all projects.
* Open two terminals
* Terminal 1 `cd server`
* Terminal 1 `java -Dspring.cloud.config.server.git.username=<stashUsername> -Dspring.cloud.config.server.git.password=<stashPassword> -jar build/libs/demo-config-server-0.0.1-SNAPSHOT.jar
* Terminal 2 `cd client`
* Terminal 2 `gradle bootRun`
* In browser:
* http://localhost:8888/config-client//master  shows all properties from the properties file config-client in the git repo
* http://localhost:8080/  says hello world with property sourced from the config server
