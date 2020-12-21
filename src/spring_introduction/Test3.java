package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

       // Pet pet = new Cat();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

     //   Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson", Person.class);

        person.callYourPet();

        context.close();
    }
}
