package listadeexercícios05ac2.exercicio01;
import java.util.*;

public class Professor extends Funcionario {
    private String urlCurriculoLattes;
    private ArrayList<Disciplina> disciplinas;

    public Professor() {
        disciplinas = new ArrayList<>();
    }

    public Professor(String nome, String cpf, String urlCurriculoLattes) {
        super(nome, cpf, 0, 0.0); 
        this.urlCurriculoLattes = urlCurriculoLattes;
        disciplinas = new ArrayList<>();
    }

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removeDisciplina(int index) {
        disciplinas.remove(index);
    }

    public void removeDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public Disciplina getDisciplina(int index) {
        return disciplinas.get(index);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        StringBuilder disciplinasString = new StringBuilder();
        for (Disciplina disciplina : disciplinas) {
            disciplinasString.append(disciplina.toString());
        }

        return  "Nome:" + super.getNome() +
                "\nCPF:" + super.getCpf() + 
                "\nNumeroCracha:" + super.getNumeroCracha() +
                "\nSalario:" + super.getSalario() +
                "\nurlCurriculoLattes:" + urlCurriculoLattes +
                "\nDisciplinas:" + disciplinasString;
    }
}
