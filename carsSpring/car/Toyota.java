package pl.sda.spring.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car {

    private Engine engine;
    private SteeringWheel steeringWheel;

    @Autowired
    public Toyota(@Qualifier("dieselEngine") Engine engine, SteeringWheel steeringWheel) {
        this.engine = engine;
        this.steeringWheel = steeringWheel;
    }

    public void printContent() {
        System.out.println("Tutaj opel z silnikiem:");
        engine.printDetails();
        System.out.println("oraz kierwonica:");
        steeringWheel.printDetails();
    }
}
