package abrigo;

public class Animal {

    String nome;
    int idade;
    String especie;
    String statusAdocao;

public Animal(String nome, int idade, String especie, String statusAdocao) {
    this.nome = nome;
    this.idade = idade;
    this.especie = especie;
    this.statusAdocao = statusAdocao;
}

public void mostrarInfo() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Espécie " + especie);
    System.out.println("Status de Adoção: " + statusAdocao);
}
}