package provapoo0205;
public class Conta {
    protected double saldo;
    private double limite;
    
    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }
    
    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public String sacar(double valor) {
        if (valor <= this.saldo + this.limite) {
            this.saldo -= valor;
            return "OK";
        } else {
            return "Valor indisponível";
        }
    }
    
    public String transferir(Conta conta, double valor) {
        if (this.sacar(valor).equals("OK")) {
            conta.deposita(valor);
            return "OK";
        } else {
            return "Valor indisponível";
        }
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void atualiza(double taxa) {
        saldo = saldo + (saldo * taxa);
    }
}

