# SpringBoot

 # 1. Build a Spring Boot App: 
    Why Spring Boot? Quick, Simple, and Powerful because almost everything is there ready for you ;-)!
    SPRING INITIALIZR is Better than Seed Projects: https://start.spring.io 
    
    Rather than build & deploy apps to Tomcat/Jetty/JBoss..... we are now embedding fractions of a Server into our application.
    Now lets PACKAGE our app as a jar and deploy it to AWS and run as a microservice, isn't that very cool?
    
    Demo
  
# 2. Load&Use Custom Dependencies/Libs in Spring Boot:
    Use fastjson for JSON <-> POJO (Jackson as default)
    
    Demo
    
 # 3. Spring Boot Dev Kits:
    Improve Develeopment Process
    a. springloaded
    b. spring-boot-devtools
    
    Demo
    
 # 4. Spring Boot JPA:
    a. What is JPA?
      - Java Persistence API available in JDK 5 ......
      - Car vs a BMW car == JPA vs Hibernate
      
    b. What is Persistence Layer? 
      - e.g. JDBC vs regular IO
      
    c. What is ORM?
      - Object Relational Mapping: DB Entity <-> Java Object
    
    d. Spring Data and Spring Data JPA
      - A framework that makes things better ...... I hope
      
    e. Mybatis vs Hibernate
      - DB Entity <-> POJO using Mappers based on SQL vs JPA
    
    Trust me I hate definations!!!
    Here are the Demos: 
      i. Spring JPA Hibernate: Basic CRUD (Repository Approach)
      ii. Spring JdbcTemplate: Same CRUD (DAO Approach)
      iii. Mybatis: Same CRUD (SQL Approach)
           - PageHelper
           - Retrieve AutoGenKeys
      
      
   # 5. Global Exception Handler
        Why?
        
        Demos:
        1. @ControllerAdvice with @ExceptionHandler
        2. SimpleMappingExceptionResolver
        
   # 6. application.properties
      a. What is this?
        - Remember Spring IoC or ServletDispatcher? Yes or :-(
          In Spring Boot, we do it here, of course you can do things in the OLD ways but I will hate you!
        - Document Ref:
        https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html
        
        Demo:
        e.g. server.context-path, port, DataSource, JPA, spring.mvc.view.???, spring.thymeleaf.??? (Coming Next)
        
    
   # 7. Views
      Lets connect more dots & finish our app!
      a. DB Done! 
        - In fact, we never did it, they are there because we have JPA did those for us! 
        - So yes we did something by doing nothing!
      
      b. Back-end APIs Done!
        - Those CRUD @RestController
        
      c. Now Font-end
        i. JSP: 
          - What is JSP? ...... Its there for like forever, still popular today to render a Web Page
          - spring.mvc.view
          
        ii. Thymeleaf:
          - What is this leaf? ..... In favor ;-)
          - spring.thymeleaf.???
          
        iii. Freemarker:
          - What is this guy? what is ftl? ......
          - spring.freemarker.???
        
        Pros + Cons: e.g. Something is better with Thymeleaf or certain things you can only do in freemarker ........
        
        Demo:
        Make all 3 of them available in our app! For the most part, developers just need 1 or maybe 2 but lets overkill our app
        with 3!
     
   # 8 Q&A?
        ??? ??? ???
        
        
        
        
        
        
    
    
  
