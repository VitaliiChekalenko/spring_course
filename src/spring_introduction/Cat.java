package spring_introduction;


import org.springframework.stereotype.Component;

import java.util.Date;

@Component("catBean")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created || "+ new Date());
    }

    @Override
    public void say() {

        System.out.println("Meow-Meow || "+ new Date());
    }
}
