package listadeexercicios.exercicio04;
import java.util.*;
public class Exercicio04 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora c = new Calculadora();
        int opcao = 0;
        while (opcao !=5) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro numero: ");
                    int num1 = teclado.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    int num2 = teclado.nextInt();
                    int resultadoInt = c.soma(num1, num2);
                    System.out.println("Resultado: " + resultadoInt);
                    break;

                case 2:
                    System.out.println("Digite o primeiro numero: ");
                    num1 = teclado.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    num2 = teclado.nextInt();
                    resultadoInt = c.subtracao(num1, num2);
                    System.out.println("Resultado: " + resultadoInt);
                    break;

                case 3:
                    System.out.println("Digite o primeiro numero: ");
                    double num3 = teclado.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    double num4 = teclado.nextDouble();
                    double resultadoDouble = c.multiplicacao(num3, num4);
                    System.out.println("Resultado: " + resultadoDouble);
                    break;

                case 4:
                    System.out.println("Digite o primeiro numero: ");
                    num3 = teclado.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    num4 = teclado.nextDouble();
                    resultadoDouble = c.divisao(num3, num4);
                    System.out.println("Resultado: " + resultadoDouble);
                    break;

                case 5:
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
