package inheritance;

public class Main {
    public static void main(String[] args) {
        Uchiha sasukeUchiha = new Uchiha();

        sasukeUchiha.name = "Sasuke Uchiha";
        sasukeUchiha.age = 21;
        sasukeUchiha.mission = "Matar o tchola do Naruto";
        sasukeUchiha.difficultyLevel = "Alta";
        sasukeUchiha.missionStatus = "Pendente";
        sasukeUchiha.specialAbility = "Jutsu bola de fogo";

        sasukeUchiha.showInformations();
    }
}
