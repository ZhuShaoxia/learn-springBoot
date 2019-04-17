package com.tlcb.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuxiaolei
 */
@SpringBootApplication
@RestController
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
		//SpringApplication springApplication = new SpringApplication(SpringBootDemoApplication.class);
		//springApplication.run();
	}
    @RequestMapping("/hello1")
    public String hello(){
        return "Hello World";
    }
}