package listadeexercícios03ac2.exercicio02;


public class ImovelNovo extends Imovel {
    private double valorAdicional;

    public ImovelNovo() {
    }

    public ImovelNovo(int codigo, String endereco, double valor, double valorAdicional) {
        super(codigo, endereco, valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double calcularValorImovel() {
        return getValor() + valorAdicional;
    }

   @Override
    public String imprimir() {
        return super.imprimir() +
                "\nValor Adicional: R$" + getValorAdicional() +
                "\nValor do Imóvel: R$" + calcularValorImovel();
    }
}
