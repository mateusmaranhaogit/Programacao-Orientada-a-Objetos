package listadeexercicios.exercicio06;

public class Vendedor {  
    private int codigo;
    private String nome;
    private double percentualComissao;
    
    public Vendedor() {}
    
    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }
    
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
    
    public double getPercentualComissao() {
        return percentualComissao;
    }
    
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * percentualComissao / 100;
    }
    
    
    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return calcularPagamentoComissao(valorVenda) - desconto;
    }
    
    public String imprimir(double valorVenda, double desconto) {
        double valorComissao = calcularPagamentoComissao(valorVenda, desconto);
        String resultado = "Codigo: " + codigo + 
                           "\nNome: " + nome + 
                           "\nValor Venda: R$" + valorVenda +
                           "\n% de Comissao: " + percentualComissao + 
                           "\nDesconto: " + desconto +
                           "\nValor a pagar: R$" + valorComissao;
        return resultado;
    }
}