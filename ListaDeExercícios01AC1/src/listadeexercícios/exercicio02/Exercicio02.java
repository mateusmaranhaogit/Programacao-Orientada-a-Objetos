package listadeexercícios.exercicio02;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        int opcao = 0;
        Aluno a = new Aluno();
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3){
            System.out.println("Menu: ");
            System.out.println("[1] Criar aluno");
            System.out.println("[2] Mostrar aluno");
            System.out.println("[3] Sair");
            
            System.out.println("Escolha a opcao que deseja: ");
            opcao = Integer.parseInt(teclado.nextLine());
            
            switch (opcao){
                case 1:
                    // 1 - Criar pessoa
                    System.out.println("Digite o RA: ");
                    a.setRA(teclado.nextLine());
                    System.out.println("Digite o nome: ");
                    a.setNome(teclado.nextLine());
                    System.out.println("Digite a nota da AC1: ");
                    a.setAC1(teclado.nextLine().charAt(0));
                    System.out.println("Digite a nota da AC2: ");
                    a.setAC2(Integer.parseInt(teclado.nextLine()));
                    System.out.println("Digite a nota da AG: ");
                    a.setAG(Integer.parseInt(teclado.nextLine()));
                    System.out.println("Digite a nota da AF: ");
                    a.setAF(Integer.parseInt(teclado.nextLine()));
                    break;
                case 2:
                    System.out.println(a.imprimir());
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