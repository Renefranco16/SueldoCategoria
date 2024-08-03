package tareasprogra2;

import java.util.Scanner;

public class TareaCalcuAmet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la categoria (1, 2, 3 o 4): ");
        int categoria = scanner.nextInt();

        System.out.print("Ingrese el sueldo actual (en Quetzales): ");
        double sueldoActual = scanner.nextDouble();

        double aumento = 0.0;

        switch (categoria) {
            case 1:
                aumento = 0.10;
                break;
            case 2:
                aumento = 0.15;
                break;
            case 3:
                aumento = 0.16;
                break;
            case 4:
                aumento = 0.18;
                break;
            default:
                System.out.println("Categoria no valida. Ingrese una categoria valida (1, 2, 3 o 4).");
                System.exit(0);
        }

        double nuevoSueldo = sueldoActual * (1 + aumento);

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Categoria: " + categoria);
        System.out.println("Sueldo actual: Q" + sueldoActual);
        System.out.println("Aumento: " + (aumento * 100) + "%");
        System.out.println("Nuevo sueldo: Q" + nuevoSueldo);

        scanner.close();
    }
}

