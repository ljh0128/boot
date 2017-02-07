 package ljh.com.controller;

 import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
  

 @Controller
 public class HelloWorldController {
     @RequestMapping(value ="/hello", method = RequestMethod.GET)
     @ResponseBody
     public String hello(){
         return "hello world";
     }
  
  
     
 
 }