package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("personBean")
public class Person {

//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

//        @Autowired
//        @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

        @Autowired

        public Person(@Qualifier("catBean") Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    public Person() {
//        System.out.println("Person bean is created");
//    }
//    // pet -> setPet
//    public void setPet(Pet pet) {
//        System.out.println("Class Person: set Pet");
//        this.pet = pet;
//    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}

