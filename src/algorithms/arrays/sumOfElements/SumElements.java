package arrays.sumOfElements;

import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum, average;

        System.out.println("Quantos números você vai digitar?");
        int amountOfIntegersToInput = scanner.nextInt();
        int[] numbers = new int[amountOfIntegersToInput];

        for (int count = 0; count < numbers.length; count++) {
            System.out.println("Digite um número: ");
            numbers[count] = scanner.nextInt();
        }

        sum = 0;
        for (int i = 0; i < amountOfIntegersToInput; i++) {
            sum += numbers[i];
        }

        System.out.print("VALORES:");
        for (int i = 0; i < amountOfIntegersToInput; i++) {
            System.out.print(" " + numbers[i]);
        }

        average = sum / amountOfIntegersToInput;

        System.out.println("\nSOMA: " + sum);
        System.out.println("MEDIA: " + average);

        scanner.close();
    }
}
