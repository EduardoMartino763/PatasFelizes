package abrigo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Abrigo abrigo = new Abrigo();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar animal");
            System.out.println("2 - Listar animais");
            System.out.println("3 - Adotar animal");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Tipo (1 - Cachorro / 2 - Gato): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipo == 1) {
                        System.out.print("Raça: ");
                        String raca = scanner.nextLine();

                        Cachorro c = new Cachorro(nome, idade, "Disponível", raca);
                        abrigo.adicionarAnimal(c);
                    } else if (tipo == 2) {
                        System.out.print("Cor: ");
                        String cor = scanner.nextLine();

                        Gato g = new Gato(nome, idade, "Disponível", cor);
                        abrigo.adicionarAnimal(g);
                    }

                    System.out.println("Animal cadastrado!");
                    break;

                case 2:
                    abrigo.listarAnimais();
                    break;

                case 3:
                    System.out.print("Nome do animal para adoção: ");
                    String nomeAdocao = scanner.nextLine();

                    abrigo.adotarAnimal(nomeAdocao);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
