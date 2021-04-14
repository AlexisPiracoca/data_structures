package utiliy;

import java.util.Scanner;

public class Keyboard {
    private final Scanner scanner;

    public Keyboard() {
        this.scanner = new Scanner(System.in);
    }

    public String readLine() {
        return scanner.nextLine();
    }

    public int readInteger() throws NumberFormatException {
        return Integer.parseInt(readLine());
    }

    public double readDouble() throws NumberFormatException {
        return Double.parseDouble(readLine());
    }

    public int readIntegerDefault(int defaultValue) {
        int number;
        try {
            number = readInteger();
        } catch (NumberFormatException e) {
            number = defaultValue;
        }
        return number;
    }

    public double readDoubleDefault(double defaultValue) {
        double number;
        try {
            number = readDouble();
        } catch (NumberFormatException e) {
            number = defaultValue;
        }
        return number;
    }

    public int readValidInteger(String message) {
        do {
            System.out.print(message);
            try {
                return readInteger();
            } catch (NumberFormatException e) {
                System.out.print("¡Número inválido! ");
            }
        } while (true);
    }

    public int readValidPositiveInteger(String message) {
        do {
            System.out.print(message);
            try {
                int num = readInteger();
                if (num >= 0) {
                    return num;
                } else {
                    System.out.print("Entero positivo inválido! ");
                }
            } catch (NumberFormatException e) {
                System.out.print("¡Número inválido! ");
            }
        } while (true);
    }

    public double readValidDouble(String message) {
        do {
            System.out.print(message);
            try {
                return readDouble();
            } catch (NumberFormatException e) {
                System.out.print("Decimal inválido! ");
            }
        } while (true);
    }

    public double readValidGrade() {
        do {
            double grade = readValidDouble("  Ingrese la nota del estudiante: ");

            if (grade <= 5 && grade >= 0) {
                return grade;
            } else {
                System.out.print(" ¡Nota no válida! ");
            }
        } while (true);
    }


}
