package aula04;

public class Pessoa {

    public String nome;
    protected long cpf;
    protected long rg;

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public Pessoa(String nome, long cpf, long rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;

    }
}

