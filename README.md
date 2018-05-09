# KRIS5 prototype

Kris5 prototype.

### Prerequisites

#### Server
Java 8,
RabbitMQ,
Maven 3,
SoapUI

#### Database
Postgres

### Built With
Maven3,
Java 8

## Configuration

### Global configuration

Each module has two configuration files - _bootstrap.yml_ and _project-name.yml_. 
_bootstrap.yml_ is located in main/resources/ of each module.

The _project-name.yml_ configuration files for each module are located in a remote repository 
in GitHub @ https://github.com/KRIS-Five/arch-concept-config
The .yml files must be modified for each environment.

In order to utilize the Spring Cloud Config server to full extent the only configuration options that are left 
into bootstrap.yml are the application name and location of the configuration service. All the rest of the options come from files in the git repository 
In each _bootstrap.yml_ file (exept kris5-config module) there is an section:

`cloud:
     config:
       uri: http://167.99.33.74:8888
       fail-fast: true
       password: pass
       username: user`

The `uri:` parameter is used to point to correct kris5-config instance in order to fetch the configuration files from there.

#### Configuring the Kris5-config module application.yml to use the correct GIT repository

The Kris5-config module needs to be configured to access the correct GIT repository in 
order to serve the config files located there.

In order to avoid confusion an _application.yml_ file is used for that purpose located at main/resources/application.yml.

The relevant section of the _application.yml_ file is : 

`spring:
  cloud:
    config:
      server:
        git:
          uri: https://github.com/KRIS-Five/arch-concept-config`

In case a different Git repository will be used the `uri:` must be pointed to correct location.




### Module specific configuration (config files in git repository)

#### KRIS5-Application-Service

The two main configuration options that need to be changed with each environment 
are database access and location of Eureka(registry) server.

`spring:
  datasource:
      platform: POSTGRESQL
      driverClassName: org.postgresql.Driver
      url: jdbc:postgresql://174.138.9.118:5432/kris5
      username: kris5
      password: 123Test`

Change the `url:`, `username:` and `password:` to match the database installation.

`eureka:
  client:
    serviceUrl:
      defaultZone: http://167.99.33.74:8761/eureka/`

Change the `defaultZone:` to point to correct Eureka instance location.


#### KRIS5-Item-Service

The two main configuration options that need to be changed with each environment 
are database access and location of Eureka(registry) server.

`spring:
  datasource:
      platform: POSTGRESQL
      driverClassName: org.postgresql.Driver
      url: jdbc:postgresql://174.138.9.118:5432/kris5
      username: kris5
      password: 123Test`

Change the `url:`, `username:` and `password:` to match the database installation.

`eureka:
  client:
    serviceUrl:
      defaultZone: http://167.99.33.74:8761/eureka/`

Change the `defaultZone:` to point to correct Eureka instance location.

#### KRIS5-XRoad-Service

It is needed to point to correct xroad mock instance

`xroad:
   host: localhost`
  
Change the `host:` value to match the correct location where mockservice is accessible.

#### KRIS5-registry

No further changes needed unless there is a need to change the instance port witch is not recommended.

#### KRIS5-monitoring

The location of the Eureka(registry) instance needs to be set.

`eureka:
  client:
    serviceUrl:
      defaultZone: http://167.99.33.74:8761/eureka/`

Change the `defaultZone:` to point to correct Eureka instance location.

#### KRIS5-gateway
The location of the Eureka(registry) instance needs to be set.

`eureka:
  client:
    serviceUrl:
      defaultZone: http://167.99.33.74:8761/eureka/`

Change the `defaultZone:` to point to correct Eureka instance location.

## Deployment

***IMPORTANT*** - Each module (except kris5-config) must have it's bootstrap.yml file 
modified to point to correct location of the kris5-config instance in order to fetch configuration files.
Please refer to **Global configuration** section for each module.

Run `mvn clean && mvn package` each project folder. The result will be a target folder in witch a _module_name.jar_
file will be located. Move the executable jar to correct location on desired server.

All artifacts are Spring boot executable. Run as service or in a screen.
More information on running Spring Boot applications as services:
https://docs.spring.io/spring-boot/docs/current/reference/html/deployment-install.html

## Running xroad mock

Xroad mock service needs to be made available for kris5-xroad-service module in order to fetch data from it.
In order to do so you must run the mockrunner service in SoapUI to create an interface witch can be used by 
kris5-xroad-service.

To run the mock server you should : 

Download the SoapUI application from https://www.soapui.org/downloads/latest-release.html

Unpack it to desired server.

Copy _kris5-prototype-mock-soapui-project.xml_ from the repository root to the same server

Run the mockrunner with command : 
` $./path_to_soapui_unpacked_folder/bin/mockservicerunner.sh -m"kris5_xroad_mock" "/path_to_the_mock_file/kris5-prototype-mock-soapui-project_v2.xml"`

## Authors

* **Endrik Linnamäe** 