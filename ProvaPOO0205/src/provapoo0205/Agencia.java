package provapoo0205;

import java.util.*;

public class Agencia {
    private String nome;
    private String endereco;
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;
    
    public Agencia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.funcionarios = new ArrayList<Funcionario>();
        this.clientes = new ArrayList<Cliente>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
    
    public double valorTotalAgencia() {
    double valorTotal = 0;
    for (Cliente cliente : clientes) {
        for (Conta conta : cliente.getConta()) {
            valorTotal += conta.getSaldo();
        }
    }
    return valorTotal;
}
}

