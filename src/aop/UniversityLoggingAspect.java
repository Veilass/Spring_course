package aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов перед методом getStudents");
//    }
//
//
//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void AfterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudents = students.get(0);
//        //Изменяет имя и оценку студента
//        String nameSurname = firstStudents.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudents.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudents.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstStudents.setAvgGrade(avgGrade);
//
//        System.out.println("AfterReturningGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов после работы методом getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс " +
//                "исключения: " + exception);
//    }


    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное " +
                "окончание работы метода или выброс исключения");
    }

}
