

import java.util.Scanner;

    public class ej1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            System.out.println("Números pares:");
            for (int i = 2; i <= numero; i += 2) {
                System.out.println(i);
            }

            System.out.println("Números impares:");
            for (int i = 1; i <= numero; i += 2) {
                System.out.println(i);
            }
        }
    }



