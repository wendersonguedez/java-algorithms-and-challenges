package algorithms.arrays._done.negatives;

import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo (max = 10): ");
        int amountOfIntegersToInput = scanner.nextInt();
        int[] numbers = new int[amountOfIntegersToInput];

        for (int count = 0; count < amountOfIntegersToInput; count++) {
            System.out.println("Digite um número: ");
            numbers[count] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("NÚMEROS NEGATIVOS: " + numbers[i]);
            }
        }

        scanner.close();
    }
}
