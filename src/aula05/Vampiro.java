package aula05;

public class Vampiro extends Inimigo{
    public Vampiro() {
        super(70);
    }

    @Override
    public int atacar() {
        System.out.println("Vampiro causou 20 de dano\nSeu personagem está sangrando");
        return 20;
    }

    @Override
    public void apanhar(String tipoAtaque, int danoRecebido) {

        if(tipoAtaque.equals(TipoDano.PERFURANTE.label)){
            danoRecebido = danoRecebido*2;
            vida = vida - (danoRecebido*2);
        }
        else{
            vida = vida - danoRecebido;
        }
        System.out.printf("Vampiro recebeu %d de dano \n", danoRecebido);

    }


    @Override
    public void interagir() {
        System.out.println("O que é um homem?");

    }



}
