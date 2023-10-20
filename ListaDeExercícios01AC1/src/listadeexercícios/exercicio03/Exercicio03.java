package listadeexercícios.exercicio03;
import java.util.*;
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        int opcao = 0;
        while (opcao !=4) {
            System.out.println("Menu:");
            System.out.println("1 - Criar Funcionario");
            System.out.println("2 - Mostrar Folha de Pagamento");
            System.out.println("3 - Alterar remuneracao");
            System.out.println("4 - Sair");
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o cracha:");
                    funcionario.setCracha(teclado.nextInt());
                    teclado.nextLine();
                    System.out.println("Digite o nome:");
                    funcionario.setNome(teclado.nextLine());
                    System.out.println("Digite o tipo de vinculo (H - Horista / M - Mensalista):");
                    funcionario.setTipoVinculo(teclado.nextLine().charAt(0));
                    if (funcionario.getTipoVinculo() == 'H') {
                        System.out.println("Digite o valor da hora:");
                        funcionario.setValorHora(teclado.nextFloat());
                        teclado.nextLine();
                        System.out.println("Digite a quantidade de horas trabalhadas:");
                        funcionario.setQtdeHora(teclado.nextFloat());
                        teclado.nextLine();
                    } else {
                        System.out.println("Digite o salario:");
                        funcionario.setSalario(teclado.nextFloat());
                        teclado.nextLine();
                    }
                    System.out.println("Digite o valor do desconto:");
                    funcionario.setValorDesconto(teclado.nextFloat());
                    teclado.nextLine();
                    break;
                case 2:
                    System.out.println(funcionario.imprimir());
                    break;
                case 3:
                    if (funcionario.getTipoVinculo() == 'H') {
                        System.out.println("Digite o valor da hora:");
                        funcionario.setValorHora(teclado.nextFloat());
                        teclado.nextLine();
                        System.out.println("Digite a quantidade de horas trabalhadas:");
                        funcionario.setQtdeHora(teclado.nextFloat());
                        teclado.nextLine();
                    } else {
                        System.out.println("Digite o salario:");
                        funcionario.setSalario(teclado.nextFloat());
                        teclado.nextLine();
                    }
                    System.out.println("Digite o valor do desconto:");
                    funcionario.setValorDesconto(teclado.nextFloat());
                    teclado.nextLine();
                    break;
                case 4:
                    System.out.println("O sistema sera fechado.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        } 
        teclado.close();
    }
}