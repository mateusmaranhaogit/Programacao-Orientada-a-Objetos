package provaaf;


public abstract class Animal {
    private String genero;
    protected String nome;
    
    public abstract String andar();
    public abstract String falar();
    
    public Animal(String genero, String nome) {
        this.genero = genero;
        this.nome = nome;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
