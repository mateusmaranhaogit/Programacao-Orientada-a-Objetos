
package provaaf;


public class Leao extends Animal {
    
    public Leao(String genero, String nome) {
        super(genero, nome);
    }
    
    @Override
    public String andar() {
        return "com as patas";
    }
    
    @Override
    public String falar() {
        return "aaarrrrrrrrrrr";
    }
}
