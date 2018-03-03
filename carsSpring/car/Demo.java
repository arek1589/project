package pl.sda.spring.car;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Demo {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);

        Car firstCar = (Car) context.getBean("opel");
        firstCar.printContent();

        Car secondCar = (Car) context.getBean("toyota");
        secondCar.printContent();


        context.close();

    }
}
