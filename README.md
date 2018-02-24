# spring-cloud-zuul-authentication
Using Spring Cloud Zuul and Spring Security as the Dependency, the  authentication system implemented by JWT, which supports role based authentication . 

the er pic is simple : 

![er.jpg](https://github.com/liumapp/spring-cloud-zuul-authentication/blob/master/pic/er.jpg)

## how to use

* start eureka , api-company , api-personal , gateway , token-manager

* open eureka , you can find our server is registed , like this : 

![eureka.jpg](https://github.com/liumapp/spring-cloud-zuul-authentication/blob/master/pic/eureka.jpg)

* while the server under runing , we can start using , and first of all , we need get our token for users.
 
    We assume that personal user is logged in with a mobile phone number, and an company user is using an email to log in.

    * login for personal users .
    
        ![personal_login.jpg](https://github.com/liumapp/spring-cloud-zuul-authentication/blob/master/pic/personal_login.jpg)
        
    * login for company users . 
    
        * login as boss
        
        * login as manager
        
        * login as employee

* now , let's see how to use the token for different roles . 

    * 
    
    