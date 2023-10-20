package provapoo0205;

public class Gerente extends Funcionario {
    private String senha;
    
    public Gerente(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf);
    }
    
    public String cadastrarSenha(String senha) {
        if (senha.length() >= 5) {
            this.senha = senha;
            return "Senha cadastrada com sucesso";
        } else {
            return "Senha deve conter no mínimo 5 caracteres";
        }
    }
    
    public boolean autentica(String senha) {
        if (this.senha != null && this.senha.equals(senha)) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void setBonificacao() {
        this.salario *= 1.2;
    }
}
