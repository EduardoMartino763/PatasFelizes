package abrigo;

import java.util.ArrayList;

public class Abrigo {

    ArrayList<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        for (Animal a : animais) {
            a.mostrarInfo();
            System.out.println("----------------");
        }
    }

        public void adotarAnimal(String nome) {
            for (Animal a : animais) {
                if (a.getNome().equals(nome)) {
                    a.setStatusAdocao("Adotado");
                    System.out.println(nome + " foi Adotado!");
                    return;
                }
            }
            System.out.println("Animal não encontrado.");
        }
    }
