package provaaf;


import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animal;
    private String endereco;
    private String nome;

    public Zoologico() {
        animal = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal.add(animal);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}