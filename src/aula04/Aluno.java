package aula04;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;

public class Aluno extends Pessoa {

    protected int idade;
    protected String turma;
    protected List<Disciplina> notasPorDisciplina = new ArrayList<>();

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Disciplina> getNotasPorDisciplina() {
        return notasPorDisciplina;
    }

    public void setNotasPorDisciplina(List<Disciplina> notasPorDisciplina) {
        this.notasPorDisciplina = notasPorDisciplina;
    }

    public Aluno(String nome, long cpf, long rg, int idade, String turma, List<Disciplina> notasPorDisciplina) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.notasPorDisciplina = notasPorDisciplina;
    }

    public String calcularMedia() {
        DoubleSummaryStatistics stats = notasPorDisciplina
                .stream()
                .flatMapToDouble(disciplina -> DoubleStream.of(disciplina.getNota()))
                .summaryStatistics();

        return "A média do aluno "+ this.nome + " é: "  + stats.getAverage();
    }

    @Override
    public String toString() {
        return "Aluno " + nome +
                " idade= " + idade +
                ", turma='" + turma + '\'' +
                ", cpf=" + cpf +
                ", rg=" + rg +
                ", notasPorDisciplina=" + notasPorDisciplina.toString()
                ;
    }
}
