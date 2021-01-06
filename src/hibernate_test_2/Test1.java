package hibernate_test_2;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {

            Session session = factory.getCurrentSession();

            Employee emp = new Employee("Alexandr", "Ivanov", "IT", 400);

            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            System.out.println("Done!");
            System.out.println(emp);
        }finally {
            factory.close();
        }
    }
}
