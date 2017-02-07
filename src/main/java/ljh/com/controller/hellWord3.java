package ljh.com.controller;

import ljh.com.boot.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class hellWord3 {

    @RequestMapping("/{id}")
    public String view(@PathVariable("id") Long id) {
       
        return "hellword";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
