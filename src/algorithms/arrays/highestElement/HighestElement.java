package arrays.highestElement;

import java.util.Scanner;

public class HighestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highestValue = 0, positionOfHighestValue = 0;

        System.out.println("Quantos números você vai digitar?");
        int amountOfNumbersInputted = scanner.nextInt();

        int[] numbersInputted = new int[amountOfNumbersInputted];

        for (int count = 0; count < amountOfNumbersInputted; count++) {
            System.out.println("Digite um número: ");
            numbersInputted[count] = scanner.nextInt();
        }

        for (int i = 0; i < amountOfNumbersInputted; i++) {
            if (numbersInputted[i] > highestValue) {
                highestValue = numbersInputted[i];
                positionOfHighestValue = i;
            }
        }

        System.out.println(highestValue);
        System.out.println(positionOfHighestValue);

    }
}
