package abrigo;

public class Gato extends Animal {

    String cor;

    public Gato(String nome, int idade, String statusAdocao, String cor) {
        super(nome, idade, "Gato", statusAdocao);
        this.cor = cor;
    }

    @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Cor: " + cor);
        }

    public void miar() {
        System.out.println(getNome() + " está miando: Miau Miau");

    }
}

