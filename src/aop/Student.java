package aop;

public class Student {
    private String nameSurname;
    private int Course;
    private double avgGrade;

    public Student(String nameSurname, int course, double avgGrade) {
        this.nameSurname = nameSurname;
        Course = course;
        this.avgGrade = avgGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return Course;
    }

    public void setCourse(int course) {
        Course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", Course=" + Course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
