import controllers.FacultyController;
import models.Student;
import models.Subject;
import utiliy.Keyboard;

public class Main {

    public static Keyboard keyboard = new Keyboard();
    public static FacultyController facultyController = new FacultyController();

    public static void main(String[] args) {
        Main main = new Main();

        main.menu();
        int option;
        do {
            System.out.print("\nSeleccione una opción en el menú principal: ");
            option = keyboard.readIntegerDefault(-1);
            switch (option) {
                case 0 -> System.out.println(" El programa ha finalizado");
                case 1 -> main.addStudent();
                case 2 -> main.printStudentsBySubject();
                case 3 -> main.addSubject();
                case 4 -> main.printSubjects();
                case 5 -> main.showSubject();
                case 6 -> main.printStatisticsFaculty();
                default -> System.out.println(" ¡Opción no disponible en el menú principal!");
            }
        } while (option != 0 );
    }

    public void menu() {
        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("╠---------------------SAC---------------------╣");
        System.out.println("║═════════════════════════════════════════════║");
        System.out.println("║   1. Agregar estudiante                     ║");
        System.out.println("║   2. Imprimir estudiantes por materia       ║");
        System.out.println("║   3. Agregar materia                        ║");
        System.out.println("║   4. Imprimir materias                      ║");
        System.out.println("║   5. Mostrar información de materia         ║");
        System.out.println("║   6. Imprimir estadísticas de la facultad   ║");
        System.out.println("║   0. Salir                                  ║");
        System.out.println("╚═════════════════════════════════════════════╝");
    }

    public void addStudent(){
        facultyController.printSubjects();
        int index = keyboard.readValidPositiveInteger("\n Ingrese el índice de la materia: ");
        facultyController.addStudentToSubject(registerStudent(), index);
    }

    public void printStudentsBySubject(){
        facultyController.printSubjects();
        facultyController.printStudentsBySubject(keyboard.readValidPositiveInteger("\n Ingrese el índice de la materia: "));
    }

    public void addSubject(){
        facultyController.addSubject(registerSubject());
    }

    public void printSubjects(){
        facultyController.printSubjects();
    }

    public void showSubject(){
        facultyController.printSubjects();
        facultyController.showSubject(keyboard.readValidPositiveInteger("\n  Ingrese el índice de la materia: "));
    }

    public void printStatisticsFaculty(){
        facultyController.printStatisticsFaculty();
    }

    public Student registerStudent(){
        Student student = new Student();
        System.out.print("\n Ingrese el nombre del estudiante: ");
        student.setName(keyboard.readLine());
        student.setGrade(keyboard.readValidGrade());
        return student;
    }

    public Subject registerSubject(){
        Subject subject = new Subject();

        System.out.print("\n Ingrese el nombre de la materia: ");
        subject.setNameSubject(keyboard.readLine());

        return subject;
    }

}
