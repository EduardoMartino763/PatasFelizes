package abrigo;

public class Cachorro extends Animal {

    String raca;

    public Cachorro(String nome, int idade, String statusAdocao, String raca) {
        super(nome, idade, "Cachorro", statusAdocao);
        this.raca = raca;
    }

    /*public void latir() {
        System.out.println(nome + "está latindo: Au Au!");*/
    }
/*}*/
