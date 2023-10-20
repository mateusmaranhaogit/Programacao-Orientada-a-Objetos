package provapoo0205;

public interface ContaDeBanco {
    public void deposita(double valor);
    public String sacar(double valor);
    public String transferencia(ContaDeBanco conta, double valor);
}
