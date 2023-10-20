package provapoo0205;
import java.util.*;
public class Cliente extends Pessoa {
    private List<Conta> contas;

    public Cliente(String nome, String telefone, String email, String cpf) {
        this.contas = new ArrayList<>();
    }

    public void setConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<Conta> getConta() {
        return this.contas;
    }

    public void cadastrarConta(double saldo, double limite) {
        Conta c = new Conta(saldo, limite);
        this.setConta(c);
    }
}
