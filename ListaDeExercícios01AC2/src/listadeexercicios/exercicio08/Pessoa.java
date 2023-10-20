package listadeexercicios.exercicio08;
import java.util.*;
public class Pessoa {
    private int codigo;
    private String nome;
    private ArrayList<Automovel> automoveis = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }

    // métodos para manipulação dos automóveis
    public void inserirAutomovel(Automovel automovel) {
        automoveis.add(automovel);
    }

    public void removerAutomovel(int index) {
        automoveis.remove(index);
    }

    public String imprimir() {
        return "Código: " + codigo + "\nNome: " + nome;
    }

    public String imprimirCompleto() {
        String resultado = "Código: " + codigo + "\nNome: " + nome + "\nAutomóveis:";
        for (Automovel automovel : automoveis) {
            resultado += "\n" + automovel.imprimir();
        }
        return resultado;
    }
}
