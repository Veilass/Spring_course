package hibernate_OneToMany_bi;

import hibernate_OneToMany_bi.entity.Department;
import hibernate_OneToMany_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        Session session = null;
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        try {
//***************************************************************
//          session = factory.getCurrentSession();
//          Department dep = new Department("Sales", 500, 1500);
//          Employee emp1 = new Employee("Zaur","Tregulov",550);
//          Employee emp2 = new Employee("Elena","Smirnova",1000);
//          Employee emp3 = new Employee("Oleg","Petrov",750);
//          Employee emp4 = new Employee("Antot","Sidorov",900);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//            dep.addEmployeeToDepartment(emp4);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//***************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();
            System.out.println("Get department");
            Department department = session.get(Department.class, 11);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Подгрузим наших работников");
            department.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());
            System.out.println("Done!");
//***************************************************************
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//            System.out.println("Done!");
//***************************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 6);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//***************************************************************

        }finally {
            session.close();
            factory.close();
        }
    }
}
