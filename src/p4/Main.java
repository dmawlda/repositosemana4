package p4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        int suma = calc.sumar(num1, num2);
        int multiplicacion = calc.multiplicar(num1, num2);
        double division = calc.dividir(num1, num2);
        System.out.println("Suma: " + suma);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        sc.close();
    }
}