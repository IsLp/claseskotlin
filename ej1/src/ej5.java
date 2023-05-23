
import java.util.Scanner;
public class ej5 {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("   Pro favor Ingrese un número entero positivo++: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("El número que ingrese  debe ser positivo ++.");
            } else {
                long factorial = calcularFactorial(numero);
                System.out.println("El factorial de " + numero + " es: " + factorial);
            }
        }

        public static long calcularFactorial(int numero) {
            if (numero == 0 || numero == 1) {
                return 1;
            } else {
                long factorial = 1;
                for (int i = 2; i <= numero; i++) {
                    factorial *= i;
                }
                return factorial;
            }
        }
    }


