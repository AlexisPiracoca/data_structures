package models;

import java.util.Arrays;

public class Subject {

    private final int NUMBER_STUDENTS = 20;

    private int subjectId;
    private String nameSubject;
    private double average;
    private String studentMaxGrade;
    private String studentMinGrade;
    private final Student[] students;
    private int positionStudent;

    public Subject() {
        students = new Student[NUMBER_STUDENTS];
        initStudents();
    }

    public Subject(int subjectId, String nameSubject, double average, String studentMaxGrade, String studentMinGrade) {
        this.subjectId = subjectId;
        this.nameSubject = nameSubject;
        this.average = average;
        this.studentMaxGrade = studentMaxGrade;
        this.studentMinGrade = studentMinGrade;

        students = new Student[10];
        initStudents();
    }

    public void initStudents() {
        Arrays.fill(students, new Student());
    }

    public void addStudent(Student student) {
        student.setStudentId(positionStudent);
        students[positionStudent] = student;
        positionStudent++;

        calculateAverage();
        calculateMinStudentGrade();
        calculateMaxStudentGrade();
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getStudentMaxGrade() {
        return studentMaxGrade;
    }

    public void setStudentMaxGrade(String studentMaxGrade) {
        this.studentMaxGrade = studentMaxGrade;
    }

    public String getStudentMinGrade() {
        return studentMinGrade;
    }

    public void setStudentMinGrade(String studentMinGrade) {
        this.studentMinGrade = studentMinGrade;
    }

    public Student[] getStudents() {
        return students;
    }

    public void calculateAverage() {
        double sum = 0;
        for (Student student : students) {
            if (student != null) {
                sum += student.getGrade();
            }
        }
        this.average = (sum / positionStudent);
    }

    public void calculateMaxStudentGrade() {
        try {
            double[] maxGrade = new double[2];

            maxGrade[0] = students[0].getGrade();
            maxGrade[1] = 0;
            for (int i = 0; i < positionStudent; i++) {
                if (maxGrade[0] < students[i].getGrade()) {
                    maxGrade[0] = students[i].getGrade();
                    maxGrade[1] = i;
                }
            }
            this.studentMaxGrade = getStudentById((int) maxGrade[1]).getName();
        } catch (NullPointerException e) {
            System.out.println("  No hay estudiantes en esta asignatura");
        }
    }


    public void calculateMinStudentGrade() {
        try {
            double[] minGrade = new double[2];

            minGrade[0] = students[0].getGrade();
            minGrade[1] = 0;
            for (int i = 1; i < positionStudent; i++) {
                if (minGrade[0] > students[i].getGrade()) {
                    minGrade[0] = students[i].getGrade();
                    minGrade[1] = i;
                }
            }
            this.studentMinGrade = getStudentById((int) minGrade[1]).getName();
        } catch (NullPointerException e) {
            System.out.println("  No hay estudiantes en esta asignatura");
        }
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    public void printStudents() {
        try {
            System.out.print(" ");
            for (int i = 0; i < positionStudent; i++) {
                System.out.print(students[i] + " ");
            }
        } catch (NullPointerException e) {
            System.out.println("  ¡No hay estudiantes en la lista!");
        }
    }

    @Override
    public String toString() {
        return " {\n  Nombre de la materia: " + nameSubject +
                "\n  Promedio: " + average +
                "\n  Nota máxima del estudiante: " + studentMaxGrade +
                "\n  Nota mínima del estudiante: " + studentMinGrade +
                "\n }";
    }
}
