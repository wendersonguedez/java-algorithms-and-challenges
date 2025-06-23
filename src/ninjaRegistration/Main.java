package ninjaRegistration;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ninjas = new String[10];
        int registredNinjas = 0;

        int menuOption = 0;
        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            menuOption = scanner.nextInt();
            // Corrige a quebra de linha que fica no buffer (área de armazenamento temporário na mémoria do computador,
            // que é usada para guardar dados enquanto eles estão sendo transferidos de um lugar para o outro)
            scanner.nextLine();

            switch (menuOption) {
                case 1:
                    if (registredNinjas == ninjas.length) {
                        System.out.println("Lista de ninjas está cheia!");
                    }

                    System.out.println("Quantos ninjas você quer cadastrar?");
                    int amountOfNinjas = scanner.nextInt();
                    scanner.nextLine();

                    if (amountOfNinjas <= 0) {
                        System.out.println("Número inválido de ninjas! Por favor, insira um número maior que zero.");
                        break;
                    }

                    for (int i = 0; i < amountOfNinjas; i++) {
                        if (registredNinjas >= ninjas.length) {
                            System.out.println("Não há mais espaço para cadastrar ninjas.");
                            break;
                        }

                        System.out.println(MessageFormat.format("Digite o nome do {0}º ninja:", registredNinjas + 1));
                        String ninjaName = scanner.nextLine();

                        // Validação do nome do ninja
                        if (ninjaName.trim().isEmpty() || ninjaName.matches("^[0-9]+$")) {
                            System.out.println("Nome inválido! O nome do ninja não pode ser vazio ou apenas números.");
                            i--; // Decrementa o índice para tentar novamente o cadastro deste ninja
                        }

                        ninjas[registredNinjas] = ninjaName;
                        registredNinjas++;
                    }

                    break;
                case 2:
                    if (registredNinjas == 0) {
                        System.out.println("Ainda não temos ninjas registrados!");
                    } else {
                        System.out.println("================== LISTA DE NINJAS ==================");
                        for (String ninja : ninjas) {
                            if (ninja != null) {
                                System.out.println(ninja);
                            }
                        }
                        System.out.println("======================================================");
                    }

                    System.out.println("\nPressione Enter para voltar ao menu...");
                    scanner.nextLine();

                    break;
                case 3:
                    System.out.println("Até logo!");
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (menuOption != 3);

        scanner.close();
    }
}
