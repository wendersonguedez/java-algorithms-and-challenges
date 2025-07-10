package inheritance;

import java.text.MessageFormat;

public class Ninja {
    String name;
    String mission;
    String difficultyLevel;
    String missionStatus;
    int age;

    public void showInformations() {
        System.out.println(MessageFormat.format("Nome: {0}", name));
        System.out.println(MessageFormat.format("Missão: {0}", mission));
        System.out.println(MessageFormat.format("Nível de Dificuldade: {0}", difficultyLevel));
        System.out.println(MessageFormat.format("Status da Missão: {0}", missionStatus));
        System.out.println(MessageFormat.format("Idade: {0}", age));
    }
}
