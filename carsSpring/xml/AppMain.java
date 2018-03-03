package pl.sda.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.spring.domain.HelloWorld;

public class AppMain {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        HelloWorld helloWorldBean = (HelloWorld) context.getBean("helloWorldBean");
        helloWorldBean.sayHello();

        context.close();
    }
}
