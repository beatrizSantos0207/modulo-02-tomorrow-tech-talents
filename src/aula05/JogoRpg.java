package aula05;

import java.util.Arrays;
import java.util.List;

public class JogoRpg {

    public static void main(String[] args) {

        Habilidades habilideFogo = new Habilidades("Bola de Fogo", TipoDano.FOGO);
        Habilidades habilidadePerfurante = new Habilidades("Bate Estaca", TipoDano.PERFURANTE);
        Habilidades habilidadePancada = new Habilidades("Fúria do Martelo", TipoDano.PANCADA);

        List<Habilidades> habilidades = Arrays.asList(habilideFogo, habilidadePerfurante, habilidadePancada);

        Heroi heroi = new Heroi("Arthur",  habilidades);

        Inimigo cobra = new Cobra();
        cobra.interagir();
        batalhar(heroi, cobra, TipoDano.PANCADA.label);

        heroi.statusJogo();

        Inimigo vampiro = new Vampiro();
        vampiro.interagir();
        batalhar(heroi, vampiro, TipoDano.PERFURANTE.label);

        heroi.statusJogo();

        Inimigo gigante = new Gigante();
        gigante.interagir();
        batalhar(heroi, vampiro, TipoDano.FOGO.label);

        heroi.statusJogo();

    }

    private static void batalhar(Heroi heroi, Inimigo inimigo, String tipoDano) {
        do {
            inimigo.apanhar(tipoDano, heroi.atacar());
            heroi.receberDano(inimigo.atacar());
            if (!heroi.isHeroiVivo()) {
                System.out.println("Sua vida chegou a 0, você morreu!");
                break;
            }
        } while (inimigo.vida > 0 && heroi.vida > 0);
    }
}

