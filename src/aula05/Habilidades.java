package aula05;

public class Habilidades {


    private String nome;
    private TipoDano tipoDano;

    public Habilidades(String nome, TipoDano tipoDano) {
        this.nome = nome;
        this.tipoDano = tipoDano;
    }

    public String getNome() {
        return nome;
    }
}
