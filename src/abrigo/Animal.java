package abrigo;

public class Animal {

    private String nome;
    private int idade;
    private String especie;
    private String statusAdocao;

    public Animal(String nome, int idade, String especie, String statusAdocao) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.statusAdocao = statusAdocao;
    }

    public String getNome() {
        return nome;
    }
    public String getStatusAdocao() {
        return statusAdocao;
    }

    public void setStatusAdocao(String statusAdocao) {
        this.statusAdocao = statusAdocao;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Espécie " + especie);
        System.out.println("Status de Adoção: " + statusAdocao);
    }
    }