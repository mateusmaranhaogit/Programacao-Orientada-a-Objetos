package provaaf;


public class Arara extends Animal {
    
    public Arara(String genero, String nome) {
        super(genero, nome);
    }
    
    @Override
    public String andar() {
        return "voando";
    }
    
    @Override
    public String falar() {
        return "aaaahaaaarrr";
    }
    
    @Override
    public String toString() {
        return "Arara [Nome: " + getNome() + ", Gênero: " + getGenero() + "]";
    }
}

