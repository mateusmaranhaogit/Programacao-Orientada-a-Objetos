package listadeexercícios03ac2.exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class ImovelMain {
    public static void main(String[] args) {
        ArrayList<Imovel> imoveis = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("Menu:");
            System.out.println("1 - Inserir imóvel");
            System.out.println("2 - Exibir imóveis");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do imóvel: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o endereço do imóvel: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Digite o valor do imóvel: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer

                    System.out.println("O imóvel é novo (1) ou velho (2)?");
                    int tipoImovel = scanner.nextInt();

                    if (tipoImovel == 1) {
                        System.out.print("Digite o valor adicional do imóvel novo: ");
                        double valorAdicional = scanner.nextDouble();
                        ImovelNovo imovelNovo = new ImovelNovo(codigo, endereco, valor, valorAdicional);
                        imoveis.add(imovelNovo);
                        System.out.println("Imóvel novo inserido com sucesso!");
                    } else if (tipoImovel == 2) {
                        System.out.print("Digite o valor do desconto do imóvel velho: ");
                        double valorDesconto = scanner.nextDouble();
                        ImovelVelho imovelVelho = new ImovelVelho(codigo, endereco, valor, valorDesconto);
                        imoveis.add(imovelVelho);
                        System.out.println("Imóvel velho inserido com sucesso!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    System.out.println("Imóveis cadastrados:");
                    for (Imovel imovel : imoveis) {
                        System.out.println(imovel.imprimir());
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println(); 
        }
        
        scanner.close();
    }
}

