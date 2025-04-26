package fundamentals.factorial;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int number = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
            int numberDecrement = number - (1 + i);

            System.out.print(numberDecrement);
        }

        /*System.out.println("Fatorial de " + number + " é " + factorial);*/
    }
}
