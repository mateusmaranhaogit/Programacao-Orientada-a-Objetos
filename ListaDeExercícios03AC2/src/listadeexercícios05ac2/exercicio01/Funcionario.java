package listadeexercícios05ac2.exercicio01;

public class Funcionario extends Pessoa {
    private int numeroCracha;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, int numeroCracha, double salario) {
        super(nome, cpf);
        this.numeroCracha = numeroCracha;
        this.salario = salario;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome:'" + super.getNome() + 
                "\nCPF:" + super.getCpf() + 
                "\nnumeroCracha=" + numeroCracha +
                "\nSalario=" + salario;
    }
}
                
