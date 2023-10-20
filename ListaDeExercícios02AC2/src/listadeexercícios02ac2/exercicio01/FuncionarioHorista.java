package listadeexercícios02ac2.exercicio01;

public class FuncionarioHorista extends Funcionario {

    private int qtdeHoras;
    private double valorHora;

    public FuncionarioHorista() {
        super();
    }

    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao, int qtdeHoras, double valorHora) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String imprimir() {
        return "FuncionarioHorista{" +
                "qtdeHoras=" + qtdeHoras +
                ", valorHora=" + valorHora +
                "} " + super.imprimir();
    }
}
