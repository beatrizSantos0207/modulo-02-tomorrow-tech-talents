package aula02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Jogador {
    private static final int FATOR_PERDA_PONTOS_PROBABILIDADE30 = 2;
    private static final int FATOR_PERDA_PONTOS_PROBABILIDADE40 = 1;

    int id;
    String nome;
    String apelido;
    Date dataNascimento;
    String posicao;
    int numero;
    double qualidade;
    int cartoesAmarelos;
    int cartoesVermelhos;
    boolean suspenso;
    int treinamento = 0;

    @Override
    public String toString() {

        return posicao + ": " + numero + " - " + nome + " (" + apelido + ")" + " - "
                + getDateAsString() + " CONDIÇÃO: " + getCondicaoJogador();
    }

    public Jogador(int id, String nome, String apelido, Date dataNascimento, String posicao, int numero, double qualidade,
                   int cartoesAmarelos, int cartoesVermelhos) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.numero = numero;
        this.dataNascimento = dataNascimento;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelhos = cartoesVermelhos;
    }

    public boolean verificarCondicaoDeJogo() {
        if (cartoesAmarelos == 3 || cartoesVermelhos == 1) {
            this.suspenso = true;
            return false;
        }
        this.suspenso = false;
        return true;
    }

    public void aplicarCartaoAmarelo(int quantidade) {
        this.cartoesAmarelos += quantidade;
        if (this.cartoesAmarelos >= 3) {
            this.suspenso = true;
        }
    }

    public void aplicarCartaoVermelho() {
        this.cartoesVermelhos++;
        this.suspenso = true;
    }

    public void cumprirSuspencao() {
        this.cartoesVermelhos = 0;
        this.cartoesAmarelos = 0;
        this.suspenso = false;
    }

    public void sofrerLesao() {
        List<Integer> probadilidades = Arrays.asList(5, 10, 15, 30, 40);
        Random rand = new Random();
        int probabilidadeLesao = probadilidades.get(rand.nextInt(probadilidades.size()));

        if (qualidade > 0) {
            if (probabilidadeLesao == 5) {
                qualidade = qualidade - (qualidade * 0.15);
            } else if (probabilidadeLesao == 10) {
                qualidade = qualidade - (qualidade * 0.10);
            } else if (probabilidadeLesao == 30) {
                qualidade = qualidade - FATOR_PERDA_PONTOS_PROBABILIDADE30;

            } else if (probabilidadeLesao == 30) {
                qualidade = qualidade - FATOR_PERDA_PONTOS_PROBABILIDADE40;
            }
        }
    }

    public void executarTreinamento() {
        if (treinamento == 0) {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(2) + 1;
            this.qualidade += numeroAleatorio;
            treinamento++;
        }
    }

    private String getDateAsString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(this.dataNascimento);
    }

    private String getCondicaoJogador() {
        return verificarCondicaoDeJogo() ? "PODE JOGAR" : "NAO PODE JOGAR";
    }

}