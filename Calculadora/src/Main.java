import java.util.Scanner;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenid@ a la calculadora");
        try {
            System.out.println("Dime el primer numero: ");
            double n = sc.nextDouble();
            System.out.println("Dime el segundo numero: ");
            double n2 = sc.nextDouble();
            System.out.println("Dame un operador: ");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+' -> System.out.println(n + " + " + n2 + " = " + (n + n2));
                case '-' -> System.out.println(n + " - " + n2 + " = " + (n - n2));
                case '*' -> System.out.println(n + " * " + n2 + " = " + (n * n2));
                case '/' -> {
                    if (n2 == 0) System.out.println("Error: división entre cero.");
                    else System.out.println(n + " / " + n2 + " = " + (n / n2)); }
                default -> System.out.println("Operador no válido");
            }
        } catch (Exception e) {
            System.out.println("Error en la calculadora");
        }
    }
}