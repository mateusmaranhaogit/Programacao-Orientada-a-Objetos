package provapoo0205;

public class TesteAgencia {
    public static void main(String[] args) {
        Agencia a = new Agencia("Agência Teste", "Rua das Teste, 123");

        Funcionario f1 = new Funcionario("Mateus", "123.456.789-00", 2000.0);
        Funcionario f2 = new Funcionario("Raphael", "987.654.321-00", 2500.0);

        a.cadastrarFuncionario(f1);
        a.cadastrarFuncionario(f2);

        ContaCorrente conta1 = new ContaCorrente(1000.0, 500.0);
        ContaCorrente conta2 = new ContaCorrente(2000.0, 1000.0);

        Cliente c1 = new Cliente("Edson", "123.456.789-00");
        Cliente c2 = new Cliente("Vinicius", "987.654.321-00");

        c1.adicionarConta(conta1);
        c2.adicionarConta(conta2);

        a.cadastrarCliente(c1);
        a.cadastrarCliente(c2);

        System.out.println("Valor total da agência: R$ " + a.valorTotalAgencia());
    }
}

    
    

