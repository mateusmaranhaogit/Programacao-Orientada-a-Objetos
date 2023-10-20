package poo.lista;
import java.util.*;
public class Fornecedor {
    private String nome;
    private ArrayList<Produto> produtos = new ArrayList<>();
        new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
}
