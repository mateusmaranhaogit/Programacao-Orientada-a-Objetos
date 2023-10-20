package provapoo0205;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }
    
    @Override
    public void deposita(double valor) {
        super.deposita(valor - 0.1);
    }
    
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (2 * taxa);
    }
}

    
