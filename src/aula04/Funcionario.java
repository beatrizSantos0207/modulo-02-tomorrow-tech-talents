package aula04;

import java.math.BigDecimal;

public class Funcionario extends Pessoa{
    private String cargo;
    protected BigDecimal salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, long cpf, long rg, String cargo, BigDecimal salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", rg=" + rg +
                '}';
    }
}
