package provapoo0205;
import java.util.*;

public class Funcionario extends Pessoa {
    private int chapa;
    double salario;
    
    public Funcionario(String nome, String telefone, String email, String cpf) {
        Random r = new Random();
        chapa = r.nextInt(0, 1000);
    }
    
    public int getChapa() {
        return chapa;
    }
    
    public void setChapa(int chapa) {
        this.chapa = chapa;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public void setBonificacao() {
        this.salario *= 1.1;
    }
}


