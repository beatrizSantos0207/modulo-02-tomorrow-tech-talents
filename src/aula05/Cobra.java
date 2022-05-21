package aula05;

public class Cobra extends Inimigo{
    public Cobra() {
        super(70) ;
    }

    @Override
    public int atacar() {
        System.out.println("Cobra causou 10 de dano \nSeu personagem está envenenado");
        return 10;
    }

    @Override
    public void apanhar(String tipoAtaque, int danoRecebido) {

        if(tipoAtaque.equals(TipoDano.PANCADA.label)){
            danoRecebido = danoRecebido*2;
            vida = vida - (danoRecebido);
        }
        else{
            vida = vida - danoRecebido;
        }
        System.out.printf("Cobra recebeu %d de dano\n", danoRecebido);

    }

    @Override
    public void interagir() {
        System.out.println("Se você acender a chama a maldição acaba.");

    }
}
