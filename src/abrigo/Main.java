package abrigo;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex", 3, "Disponível", "Labrador");
        Gato gato1 = new Gato("Mimi", 2, "Disponível", "Preto");

            cachorro1.mostrarInfo();
            /*cachorro1.latir();*/

            System.out.println();

            gato1.mostrarInfo();
            /*gato1.miar();*/
    }
}
