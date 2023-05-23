import java.util.Scanner;


import java.util.Scanner;
public class ej6 {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número entero positivo: ");
            int numero = scanner.nextInt();

            int suma = 0;

            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) {
                    suma += i;
                }
            }

            System.out.println("La suma de los números pares desde 1 hasta " + numero + " es: " + suma);

            scanner.close();
        }
    }

