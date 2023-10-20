package listadeexercicios.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        Apolice a = new Apolice();
        while (opcao != 3) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Criar Apolice");
            System.out.println("2 - Ver Dados Apolice");
            System.out.println("3 - Sair");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o numero da apolice: ");
                    int numero = teclado.nextInt();
                    teclado.nextLine(); 
                    System.out.println("Digite o nome: ");
                    String nome = teclado.nextLine();
                    System.out.println("Digite a idade: ");
                    int idade = teclado.nextInt();
                    System.out.println("Digite o sexo (M/F): ");
                    char sexo = teclado.next().charAt(0);
                    System.out.println("Digite o valor do automovel: ");
                    double valorAutomovel = teclado.nextDouble();
                    a = new Apolice(numero, nome, idade, sexo, valorAutomovel);
                    break;
                case 2:
                    if (a == null) {
                        System.out.println("Nenhuma apolice criada.");
                    } else {
                        System.out.println(a.imprimir());
                    }
                    break;
                case 3:
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
