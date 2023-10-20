package listadeexercícios03ac2.exercicio02;

public class ImovelVelho extends Imovel {
    private double valorDesconto;

    public ImovelVelho() {
    }

    public ImovelVelho(int codigo, String endereco, double valor, double valorDesconto) {
        super(codigo, endereco, valor);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double calcularValorImovel() {
        return getValor() - valorDesconto;
    }

    @Override
    public String imprimir() {
        return super.imprimir() +
                "\nValor Desconto: R$" + getValorDesconto() +
                "\nValor do Imóvel: R$" + calcularValorImovel();
    }
}
