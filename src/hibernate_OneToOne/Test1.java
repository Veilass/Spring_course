package hibernate_OneToOne;

import hibernate_OneToOne.enity.Detail;
import hibernate_OneToOne.enity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        Session session = null;
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try {
//            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Zaur", "Tregulov",
                    "IT", 500);
            Detail detail = new Detail("Baku", "123456789",
                    "zaurtreg@gmail.com");
            employee.setEmpDetail(detail);
            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();
            System.out.println("Done!");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov",
//                    "Sales", 700);
//            Detail detail = new Detail("Moscow", "987654321",
//                    "olegjacsmir@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 10);
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

        }finally {
            session.close();
            factory.close();
        }
    }
}
