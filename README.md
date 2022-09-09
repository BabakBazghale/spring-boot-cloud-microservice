# Spring Cloud + Zuul Gateway + Eureka Service Registry and Discovery + Hystrix + Fein Tutorial
___

## GitHub Repository 

[Spring Boot Cloud Microservice](https://github.com/BabakBazghale/spring-boot-cloud-microservice)

___

## About 
This project contains 5 modules.
These modules are:

- `[consumer] ` This module acts as a client and consumes hrm and finance apis with Fein.
- `[eureka-server]` This module acts as a service registry and service discovery, you can track status of other servers by accessing this URL => http://localhost:8081  
- `[finance]` Finance module contains Stock apis.
- `[human-resource-management]` Hrm module contains Employee apis.
- `[zuul-server]` Api Gateway Module uses for internal Communication between the other modules and acts as a reverse proxy.


___
## Requirements
1-Java 11 (JDK 11)  
2-Maven
* to be sure of installing the correct version of java, run `mvn -version`, here maven must show `Java 11` as version of Java.
___
## How To Run
1-  `mvn clean install`- execute this command for each module.  
2-  `mvn spring-boot:run` - execute this command in order to run each module.

NOTES:
* Run Eureka server first and access this URL for tracking the status of other servers  => http://localhost:8081  
