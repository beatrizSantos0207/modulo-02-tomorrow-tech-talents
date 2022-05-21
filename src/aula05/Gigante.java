package aula05;

public class Gigante extends Inimigo{
    public Gigante() {
        super(100);
    }

    @Override
    public int atacar() {
        System.out.println("Giagante causou 25 de dano\nSeu personagem está atordoado.");
        return 25;
    }

    @Override
    public void apanhar(String tipoAtaque, int danoRecebido) {
        if(tipoAtaque.equals(TipoDano.FOGO.label)){
            danoRecebido = danoRecebido*2;
            vida = vida - (danoRecebido*2);
        }
        else{
            vida = vida - danoRecebido;
        }
        System.out.printf("Gigante recebeu %d de dano\n", danoRecebido);

    }

    @Override
    public void interagir() {
        System.out.println("Me desculpe.");

    }


}
