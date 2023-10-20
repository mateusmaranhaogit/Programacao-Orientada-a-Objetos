package listadeexercícios02ac2.exercicio01;

public class FuncionarioMensalista extends Funcionario{
    private double salario;
    
    public FuncionarioMensalista() {
        super();
    }

    public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao, double salario) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String imprimir() {
        return super.imprimir + "Salário: " + salario;
    }
}
