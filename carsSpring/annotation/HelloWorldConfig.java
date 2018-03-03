package pl.sda.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.sda.spring.domain.HelloWorld;
import pl.sda.spring.domain.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {

	@Bean(name="helloWorldBean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl("Spring!");
	}

}


