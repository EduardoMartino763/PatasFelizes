package abrigo;

public class Cachorro extends Animal {

    String raca;

    public Cachorro(String nome, int idade, String statusAdocao, String raca) {
        super(nome, idade, "Cachorro", statusAdocao);
        this.raca = raca;
    }

    @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Raça: " + raca);
        }

    public void latir() {
        System.out.println(getNome() + "está latindo: Au Au!");
    }
}
