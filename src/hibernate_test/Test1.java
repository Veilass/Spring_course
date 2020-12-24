package hibernate_test;

import hibernate_test.enity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Alexander", "Ivanov",
                    "IT", 600);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            System.out.println(emp);

            System.out.println("Done");
        }finally {
            factory.close();
        }
    }
}
