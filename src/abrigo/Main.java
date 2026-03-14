package abrigo;

public class Main {
    public static void main(String[] args) {

        Abrigo abrigo = new Abrigo();

        Cachorro cachorro1 = new Cachorro("Rex", 3, "Disponível", "Labrador");
        Gato gato1 = new Gato("Mimi", 2, "Disponível", "Preto");

        abrigo.adicionarAnimal(cachorro1);
        abrigo.adicionarAnimal(gato1);

        System.out.println("Animais no abrigo:");
        abrigo.listarAnimais();

        System.out.println("\nAdotando Rex...\n");
        abrigo.adotarAnimal("Rex");

        System.out.println("\nLista atualizada:");
        abrigo.listarAnimais();
    }
}
