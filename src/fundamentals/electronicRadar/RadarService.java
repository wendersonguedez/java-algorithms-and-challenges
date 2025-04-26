package fundamentals.electronicRadar;

import java.text.MessageFormat;

public class RadarService {
    public static final int SPEED_LIMIT = 80;
    public static final int FINE_PER_KM = 7;

    public static int calculateFine(Car car) {
        int speed = car.getSpeed();

        if (speed > SPEED_LIMIT) {
            return (speed - SPEED_LIMIT) * FINE_PER_KM;
        }
        return 0;
    }

    public static String generateMessage(int fine) {
        if (fine > 0) {
            return MessageFormat.format("Multa no valor de R$: {0}", fine);
        } else {
            return "Você está dentro do limite de velocidade.";
        }
    }
}
