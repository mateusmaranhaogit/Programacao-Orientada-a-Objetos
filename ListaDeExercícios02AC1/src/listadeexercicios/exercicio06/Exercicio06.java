package listadeexercicios.exercicio06;
import java.util.*;
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vendedor vendedor = null;
        int opcao = 0;
        
        while (opcao != 3) {
            System.out.println("1 - Cadastrar Vendedor");
            System.out.println("2 - Calcular Comissao");
            System.out.println("3 - Sair");
            System.out.print("Opcao: ");
            
            opcao = teclado.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.print("Digite o codigo: ");
                    int codigo = teclado.nextInt();
                    System.out.print("Digite o nome: ");
                    String nome = teclado.next();
                    System.out.print("Digite o percentual de comissao: ");
                    double percentualComissao = teclado.nextDouble();
                    vendedor = new Vendedor(codigo, nome, percentualComissao);
                    System.out.println("Vendedor cadastrado com sucesso!");
                    break;
                case 2:
                    if(vendedor == null) {
                        System.out.println("Cadastre um vendedor antes de calcular a comissao!");
                        break;
                    }
                    System.out.print("Digite o valor da venda: ");
                    double valorVenda = teclado.nextDouble();
                    System.out.print("Digite o valor do desconto: ");
                    double desconto = teclado.nextDouble();
                    String resultado = vendedor.imprimir(valorVenda, desconto);
                    System.out.println(resultado);
                    break;
                case 3:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opcao invalida! Digite novamente.");
                    break;
            }
        } 
    teclado.close();
    }
}
    