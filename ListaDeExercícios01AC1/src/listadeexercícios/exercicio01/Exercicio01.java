package listadeexercícios.exercicio01;

import listadeexercícios.exercicio01.Pessoa;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[]args){
        int opcao = 0;
        Pessoa p = new Pessoa();
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3){
            System.out.println("Menu: ");
            System.out.println("[1] Criar pessoa");
            System.out.println("[2] Mostrar pessoa");
            System.out.println("[3] Sair");
            
            System.out.println("Escolha a opcao que deseja: ");
            opcao = Integer.parseInt(teclado.nextLine());
            
            switch (opcao){
                case 1:
                    // 1 - Criar pessoa
                    System.out.println("Digite o CPF: ");
                    p.setCPF(teclado.nextLine());
                    System.out.println("Digite o nome: ");
                    p.setNome(teclado.nextLine());
                    System.out.println("Digite o Sexo [M/F]: ");
                    p.setSexo(teclado.nextLine().charAt(0));
                    System.out.println("Digite a idade: ");
                    p.setIdade(Integer.parseInt(teclado.nextLine()));
                    break;
                case 2:
                    System.out.println(p.imprimir());
                    break;
                case 3:
                    System.out.println("O sistema sera fechado.");
                    break;
     
                default:
                    System.out.println("Opcao invalida.");
            }
            
        }
        teclado.close();
    }
            
}