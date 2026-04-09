package MiniCalculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MINI CALCULADORA =====");
            System.out.println("1. Raíz cuadrada");
            System.out.println("2. Valor absoluto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion != 0) {
                System.out.print("Introduce un número: ");
                double numero = scanner.nextDouble();
                MiniCalculadora calc = new MiniCalculadora(numero);

                switch (opcion) {
                    case 1:
                        double raiz = calc.raizCuadrada();
                        if (raiz == 0 && numero < 0)
                            System.out.println("Error: no se puede calcular la raíz de un número negativo.");
                        else
                            System.out.println("Resultado: " + raiz);
                        break;

                    case 2:
                        System.out.println("Resultado: " + calc.valorAbsoluto());
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            }

        } while (opcion != 0);

        System.out.println("Saliendo... ¡Hasta luego!");
        scanner.close();
    }
}
