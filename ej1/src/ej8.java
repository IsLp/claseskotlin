import java.util.Scanner;
public class ej8 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el número de inicio: ");
            int inicio = scanner.nextInt();

            System.out.print("Ingrese el número de fin: ");
            int fin = scanner.nextInt();

            System.out.println("Los números primos en el rango de " + inicio + " a " + fin + " son:");

            for (int num = inicio; num <= fin; num++) {
                if (isPrime(num)) {
                    System.out.println(num);
                }
            }

            scanner.close();
        }

        // Método para verificar si un número es primo
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }


