package PooEjercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("APLICACIÓN CALCULADORA");
        Float num1, num2;
        System.out.println("Ingrese el valor 1:");
        num1 = teclado.nextFloat();
        System.out.println("Ingrese el valor 2:");
        num2 = teclado.nextFloat();

        Calculadora calcu = new Calculadora();
        calcu.menu();

        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
            System.out.println("El resultado de la suma es: " + calcu.operacionSuma(num1, num2));
            break;
            case 2:
            System.out.println("El resultado de la resta es: " + calcu.operacionResta(num1, num2));
            break;
            case 3:
            System.out.println("El resultado de la multiplicación es: " + calcu.operacionMultiplicacion(num1, num2));
            break;
            case 4:
            System.out.println("El resultado de la división es: " + calcu.operacionDivision(num1, num2));
            break;
            default:
            System.out.println("Ingrese una opción válida");
        }

        teclado.close();
    }
}
