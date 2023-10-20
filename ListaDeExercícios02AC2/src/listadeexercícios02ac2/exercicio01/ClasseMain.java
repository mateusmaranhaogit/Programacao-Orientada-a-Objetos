package listadeexercícios02ac2.exercicio01;
import java.util.*;
public class ClasseMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Inserir Funcionário");
            System.out.println("2 - Exibir Funcionários");
            System.out.println("3 - Sair");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Tipo de Funcionário (1 - Mensalista, 2 - Horista):");
                int tipo = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Número do Crachá:");
                int numeroCracha = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Nome:");
                String nome = scanner.nextLine();

                System.out.println("Setor:");
                String setor = scanner.nextLine();

                System.out.println("Função:");
                String funcao = scanner.nextLine();

                if (tipo == 1) {
                    System.out.println("Salário:");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista(numeroCracha, nome, setor, funcao, salario);
                    funcionarios.add(funcionarioMensalista);
                } else if (tipo == 2) {
                    System.out.println("Quantidade de Horas:");
                    int qtdeHoras = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Valor da Hora:");
                    double valorHora = scanner.nextDouble();
                    scanner.nextLine();

                    FuncionarioHorista funcionarioHorista = new FuncionarioHorista(numeroCracha, nome, setor, funcao, qtdeHoras, valorHora);
                    funcionarios.add(funcionarioHorista);
                }
            } else if (opcao == 2) {
                System.out.println("Funcionários:");
                for (Funcionario funcionario : funcionarios) {
                    System.out.println(funcionario.imprimir());
                }
            } else if (opcao == 3) {
                break;
            }
        }

        scanner.close();
    }
}
