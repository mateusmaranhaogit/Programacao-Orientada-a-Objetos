package provapoo0205;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (3 * taxa);
    }
}
