package p4;
public class Calculadora {

    // Función 1: sumar
    public int sumar(int a, int b) {
        return a + b;
    }

    // Función 2: multiplicar
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Función 3: dividir
    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre 0");
            return 0;
        }
        return (double) a / b;
    }
}