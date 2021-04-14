package models;

public class Student {

    private int studentId;
    private String name;
    private double grade;

    public Student() {
    }

    public Student(int studentId, String name, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return  " {\n  Nombre del estudiante: " + name +
                "\n  Nota final: " + grade +
                "\n }";
    }
}
