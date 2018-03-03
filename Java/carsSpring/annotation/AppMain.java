package pl.sda.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import pl.sda.spring.domain.HelloWorld;

public class AppMain {

	public static void main(String args[]) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
		bean.sayHello();

		context.close();

	}

}
