package aula05;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Heroi extends Personagem {


    private List<Habilidades> habilidades = new ArrayList<>();

    public Heroi(String nome,  List<Habilidades> habilidades) {
        this.nome = nome;
        this.vida = 100;
        this.habilidades = habilidades;

    }

    @Override
    public void apanhar(String tipoAtaque, int danoRecebido) {
        vida = vida - danoRecebido;

        System.out.printf("Herói recebeu %d dano. Sua vida esta em %d.\n", danoRecebido, vida);

    }

    public void receberDano(int danoRecebido) {
        apanhar(null, danoRecebido);
    }


    public boolean statusJogo() {
        if (!isHeroiVivo()) {
            System.out.println("Você morreu.");
            return false;
        } else {
            System.out.println("Você ganhou.");
            return true;
        }
    }

    public boolean isHeroiVivo(){
        return vida != 0;
    }

    @Override
    public int atacar() {
        Random random = new Random();
        return random.nextInt(100);
    }
}