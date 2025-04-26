package fundamentals.electronicRadar;

import java.text.MessageFormat;
import java.util.Scanner;

public class Radar {

    public static void main(String[] args) {
        int speed = InputReader.readCarSpeed();
        Car car = new Car(speed);

        int fine = RadarService.calculateFine(car);
        String messageToDriver = RadarService.generateMessage(fine);

        System.out.println(messageToDriver);
    }
}
