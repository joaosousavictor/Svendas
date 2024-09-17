package fundamentos;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int a = 10;
        int b = 5;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        // Operadores Relacionais
        System.out.println("Igual a: " + (a == b));
        System.out.println("Diferente de: " + (a != b));
        System.out.println("Maior que: " + (a > b));
        System.out.println("Menor que: " + (a < b));

        // Operadores Lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("AND lógico: " + (x && y));
        System.out.println("OR lógico: " + (x || y));
        System.out.println("NOT lógico: " + !x);
    }
}