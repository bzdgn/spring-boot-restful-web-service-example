Spring Boot RESTful Webservice Example
======================================
The main purpose of this sample project is to demonstrate the capabilities of spring boot.
But additionally, I want to show challenging problems that can occur during the development
while using the Spring Boot. 

First goal is to show how it is easy to start a web service with embedded tomcat and embedded
H2 database. This is the main goal of the project.

Secondly, we are using Spring and I have used dependency injection. But what is a challenging
problem about dependency injection. Assume that you have two implementations ready for one
implementation, how are you going to select the implementation? I'll explain several ways but
also I'll demonstrate how we can select our implementation via external configuration so that
we can update our configuration and don't need to touch the code, restart our jar file and
that's all.

Thirdly, I also have demonstrated how to use Java Application Configuration within the double
implementation for the single interface scenario I've explained above.

Lastly, I will explain all the deployment details, the main configuration of the whole project
including H2 database configuration.

Moreover, I will also demonstarte how you are going to test your RESTful application with
Postman tool.

TOC
---
- [0 Prerequisite](#0-prerequisite) <br/>
- [1 Entry Point](#1-entry-point) <br/>
- [2 Repository](#2-repository) <br/>
- [3 Using Config Manager](#3-using-config-manager) <br/>
- [4 Logging](#4-logging) <br/>
- [5 Testing And Incoming Outgoing JSON Samples](#5-testing-and-incoming-outgoing-json-samples) <br/>
  * [5-a- Test Web Service](#5-a-test-web-service) <br/>
  * [5-b- Retrieve All Customer Collection](#5-b-retrieve-all-customer-collection) <br/>
  * [5-c- Retrieve Customer](#5-c-retrieve-customer) <br/>
  * [5-d- Create Customer](#5-d-create-customer) <br/>
  * [5-e- Update Customer](#5-e-update-customer) <br/>
  * [5-f- Delete Customer](#5-f-delete-customer) <br/>
  
 0 Prerequisite
---------------
To use this project, you are going to need;

- Java JDK 8 (1.8)
- Maven compatibile with JDK 8
- Any Java IDE

