package pl.sda.spring.car;

import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements Engine {

    public void printDetails() {
        System.out.println("Silnik diesel o pojemności 2.5 i mocy 130km");
    }
}
