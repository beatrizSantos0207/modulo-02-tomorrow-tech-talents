package aula05;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    public abstract int atacar();
    public void apanhar(String tipoAtaque, int danoRecebido) {
    }
}
