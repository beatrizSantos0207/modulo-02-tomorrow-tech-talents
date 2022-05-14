package aula04;

import java.math.BigDecimal;

public class Professor extends Funcionario {
    protected String turmas;
    protected String disciplinas;

    public Professor(String nome, long cpf, long rg, String cargo, BigDecimal salario, String turmas, String disciplinas) {
        super(nome, cpf, rg, cargo, salario);
        this.turmas = turmas;
        this.disciplinas = disciplinas;
    }

    public String getTurmas() {
        return turmas;
    }

    public void setTurmas(String turmas) {
        this.turmas = turmas;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", rg=" + rg +
                ", turmas='" + turmas + '\'' +
                ", disciplinas='" + disciplinas + '\'' +
                '}';
    }
}
