package listadeexercícios05ac2.exercicio01;
import java.util.*;
public class Exercicio01 {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner tec = new Scanner(System.in);
        int opcao = 0;
        while (opcao !=7) {
            System.out.println("MENU");
            System.out.println("1 - Inserir Disciplina");
            System.out.println("2 - Inserir Professor");
            System.out.println("3 - Inserir Atendente");
            System.out.println("4 - Inserir Aluno");
            System.out.println("5 - Adicionar Disciplina ao Professor");
            System.out.println("6 - Mostrar Pessoas");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");
            opcao = tec.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("INSERIR DISCIPLINA");
                    System.out.print("Código: ");
                    int codigoDisciplina = tec.nextInt();
                    System.out.print("Nome: ");
                    String nomeDisciplina = tec.next();
                    Disciplina disciplina = new Disciplina(codigoDisciplina, nomeDisciplina);
                    pessoas.add(disciplina);
                    System.out.println("Disciplina inserida com sucesso!");
                    break;

                case 2:
                    System.out.println("INSERIR PROFESSOR");
                    System.out.print("Nome: ");
                    String nomeProfessor = tec.next();
                    System.out.print("CPF: ");
                    String cpfProfessor = tec.next();
                    System.out.print("URL do currículo Lattes: ");
                    String urlCurriculoLattes = tec.next();
                    Professor professor = new Professor(nomeProfessor, cpfProfessor, urlCurriculoLattes);
                    pessoas.add(professor);
                    System.out.println("Professor inserido com sucesso!");
                    break;

                case 3:
                    System.out.println("INSERIR ATENDENTE");
                    System.out.print("Nome: ");
                    String nomeAtendente = tec.next();
                    System.out.print("CPF: ");
                    String cpfAtendente = tec.next();
                    System.out.print("Número do crachá: ");
                    int numeroCracha = tec.nextInt();
                    System.out.print("Salário: ");
                    double salario = tec.nextDouble();
                    System.out.print("Setor: ");
                    String setor = tec.next();
                    System.out.print("Função: ");
                    String funcao = tec.next();
                    Atendente atendente = new Atendente(nomeAtendente, cpfAtendente, numeroCracha, salario, setor, funcao);
                    pessoas.add(atendente);
                    System.out.println("Atendente inserido com sucesso!");
                    break;

                case 4:
                    System.out.println("INSERIR ALUNO");
                    System.out.print("Nome: ");
                    String nomeAluno = tec.next();
                    System.out.print("CPF: ");
                    String cpfAluno = tec.next();
                    System.out.print("RA: ");
                    String ra = tec.next();
                    System.out.print("Curso: ");
                    String curso = tec.next();
                    Aluno aluno = new Aluno(nomeAluno, cpfAluno, ra, curso);
                    pessoas.add(aluno);
                    System.out.println("Aluno inserido com sucesso!");
                    break;
            
                case 5:
                    if (pessoas.size() > 0) {
                        String cpf;
                        System.out.println("Digite o CPF do professor que deseja adicionar a disciplina:");
                        cpf = tec.next();
                        for (Pessoa p : pessoas) {
                            if (p instanceof Professor && p.getCpf().equals(cpf)) {
                                System.out.println("Digite o código da disciplina:");
                                int codigo = tec.nextInt();
                                System.out.println("Digite o nome da disciplina:");
                                String nome = tec.next();
                                Disciplina disciplina = new Disciplina(codigo, nome);
                                ((Professor) p).addDisciplina(disciplina);
                                System.out.println("Disciplina adicionada com sucesso ao professor " + p.getNome());
                                break;
                            }
                        }
                    } else {
                        System.out.println("Não há pessoas cadastradas!");
                    }
                    break;
            }
        }
        }
}