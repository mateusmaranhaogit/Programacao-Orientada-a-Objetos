package listadeexercícios.exercicio02;

public class Aluno {
    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public void setRA(String ra) {
        this.ra = ra;
    }

    public String getRA() {
        return ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAC1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAC1() {
        return ac1;
    }

    public void setAC2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAC2() {
        return ac2;
    }

    public void setAG(float ag) {
        this.ag = ag;
    }

    public float getAG() {
        return ag;
    }

    public void setAF(float af) {
        this.af = af;
    }

    public float getAF() {
        return af;
    }

    public float calcularMedia() {
        return (ac1 * 0.15f) + (ac2 * 0.30f) + (ag * 0.10f) + (af * 0.45f);
}
    
    public String verificarAprovacao() {
        if (calcularMedia() >= 5) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
    public String imprimir() {
        String resultado = "RA: " + ra + "\n";
        resultado += "Nome: " + nome + "\n";
        resultado += "AC1: " + String.format("%.2f", ac1) + "\n";
        resultado += "AC2: " + ac2 + "\n";
        resultado += "AG: " + ag + "\n";
        resultado += "AF: " + af + "\n";
        resultado += "Média: " + String.format("%.2f", calcularMedia()) + "\n";
        resultado += "Situação: " + verificarAprovacao();
        return resultado;
    }
}