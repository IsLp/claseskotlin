import java.util.Scanner;
public class ej7 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de números de la serie Fibonacci que desea calcular: ");
            int n = scanner.nextInt();

            System.out.println("Los primeros " + n + " números de la serie Fibonacci son:");

            int firstNumber = 1;
            int secondNumber = 1;

            System.out.print(firstNumber + ", " + secondNumber + ", ");

            for (int i = 3; i <= n; i++) {
                int nextNumber = firstNumber + secondNumber;
                System.out.print(nextNumber + ", ");

                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }

            scanner.close();
        }
    }

