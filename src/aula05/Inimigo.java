package aula05;

public abstract class Inimigo extends Personagem {

    public abstract void interagir();

    public Inimigo(int vida) {
        this.vida = vida;
    }

}
