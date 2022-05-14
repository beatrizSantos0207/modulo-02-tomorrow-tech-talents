package aula04;

public class Disciplina {

    private String nome;
    private double nota;
    protected Professor professor;

    public double getNota() {
        return nota;
    }

    public Disciplina(String nome, double nota, Professor professor) {
        this.nome = nome;
        this.nota = nota;
        this.professor = professor;
    }

    public Disciplina(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " " + "nota=" +  + nota;
    }
}
