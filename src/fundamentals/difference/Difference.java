package fundamentals.difference;

import java.util.Scanner;

/*
* Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença
* do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*
* */

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int numberA = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int numberB = scanner.nextInt();

        System.out.println("Digite o valor de C: ");
        int numberC = scanner.nextInt();

        System.out.println("Digite o valor de D: ");
        int numberD = scanner.nextInt();

        int difference = (numberA * numberB - (numberC * numberD));

        System.out.println("Diferença: " + difference);
    }
}
