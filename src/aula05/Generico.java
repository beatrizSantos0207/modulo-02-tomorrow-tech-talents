package aula05;

public class Generico extends Inimigo {

    public Generico() {
        super(50);
    }

    @Override
    public int atacar() {
        System.out.println("Genérico causou 10 de dano\n");
        return 10;
    }

    @Override
    public void apanhar(String tipoAtaque, int danoRecebido) {
        System.out.printf("Genérico recebeu %s de dano\n", danoRecebido);
        vida = vida - danoRecebido;
    }


    @Override
    public void interagir() {
        System.out.println("Por que eu responderia meu inimigo???");

    }
}
