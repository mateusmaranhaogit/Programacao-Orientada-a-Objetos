package listadeexercícios03ac2.exercicio02;

public class Imovel {
    private int codigo;
    private String endereco;
    private double valor;

    public Imovel() {
    }

    public Imovel(int codigo, String endereco, double valor) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String imprimir() {
        return "Código: " + getCodigo() +
                "\nEndereço: " + getEndereco() +
                "\nValor: R$" + getValor();
    }
}
