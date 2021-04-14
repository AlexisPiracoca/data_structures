package controllers;

import models.FacultySE;
import models.Student;
import models.Subject;

public class FacultyController {

    private final FacultySE systemsEngineer;

    public FacultyController() {
        systemsEngineer = new FacultySE();
        initSubjects();
    }

    public void printStatisticsFaculty(){
        systemsEngineer.calculateStatistics();
        System.out.println(systemsEngineer);
    }

    public void addStudentToSubject(Student student, int subject) {
        try {
            systemsEngineer.getSubjects()[subject].addStudent(student);
        } catch (NullPointerException e) {
            System.err.println("  ¡El índice ingresado de la materia no es correcto!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("  ¡Índice fuera del límite de la lista!");
        }
    }

    public void printSubjects() {
        systemsEngineer.printSubjects();
    }

    public void printStudentsBySubject(int subject) {
        try {
            systemsEngineer.getSubjects()[subject].printStudents();
        } catch (NullPointerException e) {
            System.err.println("  ¡El índice ingresado de la materia no es correcto!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("  ¡Índice fuera del límite de la lista!");
        }
    }

    public void addSubject(Subject subject) {
        systemsEngineer.addSubject(subject);
    }

    public void showSubject(int subjectId) {
        try {
            System.out.println(systemsEngineer.getStudentById(subjectId));
        } catch (NullPointerException e) {
            System.err.println("  ¡El índice ingresado de la materia no es correcto!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("  ¡Índice fuera del límite de la lista!");
        }
    }

    public void initSubjects() {
        systemsEngineer.addSubject(new Subject(0, "Estructuras de datos",
                0, "", ""));
        systemsEngineer.addSubject(new Subject(0, "Bases de datos",
                0, "", ""));
        systemsEngineer.addSubject(new Subject(0, "Requerimientos",
                0, "", ""));
        systemsEngineer.addSubject(new Subject(0, "Desarrollo empresarial",
                0, "", ""));
        systemsEngineer.addSubject(new Subject(0, "Deep Learning",
                0, "", ""));
        systemsEngineer.addSubject(new Subject(0, "Construcción de software",
                0, "", ""));
        systemsEngineer.addSubject(new Subject(0, "Optimización",
                0, "", ""));
    }

}
