package pl.sda.spring.car;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine {

    public void printDetails() {
        System.out.println("Silnik benzynowy o pojemności 2.0 i mocy 145km");
    }
}
