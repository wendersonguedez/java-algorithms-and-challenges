package fundamentals.electronicRadar;

import java.util.Scanner;

public class InputReader {
    public static int readCarSpeed() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a velocidade atual do carro? (km/h)");

        int speed = scanner.nextInt();
        scanner.close();

        return speed;
    }
}
