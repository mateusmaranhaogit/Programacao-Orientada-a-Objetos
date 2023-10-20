package listadeexercicios.exercicio08;
import java.util.*;
public class ClasseMain {

    static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    static ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        
        while (opcao != 6) {
            System.out.println("Menu:");
            System.out.println("1 - Criar Pessoa");
            System.out.println("2 - Criar Automóvel");
            System.out.println("3 - Transferir Automóvel");
            System.out.println("4 - Mostrar Todas as Pessoas");
            System.out.println("5 - Mostrar automóvel da pessoa");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do scanner
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o código da pessoa:");
                    int codigo = sc.nextInt();
                    sc.nextLine(); 
                    System.out.println("Digite o nome da pessoa:");
                    String nome = sc.nextLine();
                    Pessoa novaPessoa = new Pessoa(codigo, nome);
                    break;
                case 2:
                    System.out.println("Digite a marca do automóvel:");
                    String marca = sc.nextLine();
                    System.out.println("Digite o modelo do automóvel:");
                    String modelo = sc.nextLine();
                    Automovel novoAutomovel = new Automovel(marca, modelo);
                    break;
                case 3:
                    // Mostra a lista de pessoas
                    System.out.println("Selecione a pessoa de origem:");
                    for (int i = 0; i < pessoas.size(); i++) {
                    System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    int indicePessoaOrigem = sc.nextInt();
                    Pessoa pessoaOrigem = pessoas.get(indicePessoaOrigem);
                    ArrayList<Automovel> automoveisPessoaOrigem = pessoaOrigem.getAutomoveis();
                    System.out.println("Selecione o automóvel:");
                    for (int i = 0; i < automoveisPessoaOrigem.size(); i++) {
                    System.out.println(i + " - " + automoveisPessoaOrigem.get(i).getModelo());
                    }
                    int indiceAutomovel = sc.nextInt();
                    System.out.println("Selecione a pessoa de destino:");
                    for (int i = 0; i < pessoas.size(); i++) {
                    System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    int indicePessoaDestino = sc.nextInt();
                    Pessoa pessoaDestino = pessoas.get(indicePessoaDestino);
                    Automovel automovel = automoveisPessoaOrigem.get(indiceAutomovel);
                    pessoaOrigem.removerAutomovel(indiceAutomovel);
                    pessoaDestino.inserirAutomovel(automovel);
                    System.out.println("Automóvel transferido com sucesso!");
                                    break;
                case 4:    
                    System.out.println("Lista de Pessoas:");
                    for (Pessoa pessoa : listaPessoas) {
                    System.out.println(pessoa.imprimir());
                    }
                    break;
                case 5:
                    if (listaPessoas.isEmpty()) {
                    System.out.println("Não há pessoas cadastradas.");
                    return;
                    }
                    System.out.println("Selecione uma pessoa:");
                    for (int i = 0; i < listaPessoas.size(); i++) {
                    System.out.println(i + " - " + listaPessoas.get(i).getNome());
                    }
                    int opcaoPessoa = opcaoPessoa("Opção: ");
                    if (opcaoPessoa < 0 || opcaoPessoa >= listaPessoas.size()) {
                    System.out.println("Opção inválida.");
                    return;
                    }
                    Pessoa pessoaSelecionada = listaPessoas.get(opcaoPessoa);
                    ArrayList<Automovel> automoveis = pessoaSelecionada.getAutomoveis();
    
                    if (automoveis.isEmpty()) {
                    System.out.println("A pessoa não possui automóveis cadastrados.");
                    } else {
                    System.out.println("Automóveis de " + pessoaSelecionada.getNome() + ":");
                    for (int i = 0; i < automoveis.size(); i++) {
                    System.out.println(i + " - " + automoveis.get(i).getModelo());
                    }
                }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                            }
                        }
        sc.close();
    }

    private static int opcaoPessoa(String opção_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
