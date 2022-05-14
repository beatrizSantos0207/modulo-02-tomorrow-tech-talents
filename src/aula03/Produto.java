package aula03;

import java.util.UUID;

public class Produto {

    private String id;
    private String nome;
    private String sessao;
    private String tipo;
    private int quantidadeEstoque;
    private String marca;


    public Produto(String nome, String sessao, String tipo, int quantidadeEstoque, String marca) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.sessao = sessao;
        this.tipo = tipo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", sessao='" + sessao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public String getSessao() {
        return sessao;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getMarca() {
        return marca;
    }

    public String getId() {
        return id;
    }

}
