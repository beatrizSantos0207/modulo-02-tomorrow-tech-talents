package aula02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CadastraJogador {
    public static void main(String[] args) throws ParseException {

        Jogador jogador1 = new Jogador(123, "Neymar", "Menino Ney",
                getDataNascimentoAsDate("19/12/1991"), "Atacante", 10,
                10, 2, 1);
        Jogador jogador2 = new Jogador(113, "Alisson", "Ali",
                getDataNascimentoAsDate("20/02/1991"), "Goleiro", 1,
                10, 0, 0);
        Jogador jogador3 = new Jogador(146, "Everson", "Veveto",
                getDataNascimentoAsDate("03/01/1998"), "Zagueiro", 16,
                8, 1, 1);
        Jogador jogador4 = new Jogador(133, "Marcos", "Marquinhos",
                getDataNascimentoAsDate("04/11/1996"), "Zagueiro", 22,
                7, 1, 0);
        Jogador jogador5 = new Jogador(178, "Eder", "Militao",
                getDataNascimentoAsDate("20/12/1999"), "Zagueiro", 34,
                9, 0, 0);
        Jogador jogador6 = new Jogador(147, "Felipe", "Felipinho",
                getDataNascimentoAsDate("13/01/1992"), "Centroavante", 14,
                8, 0, 0);
        Jogador jogador7 = new Jogador(187, "Alex", "Teles",
                getDataNascimentoAsDate("10/07/1992"), "Lateral Esquerda", 17,
                8, 1, 0);
        Jogador jogador8 = new Jogador(197, "Daniel", "Dani",
                getDataNascimentoAsDate("20/06/1985"),
                "Lateral Direita", 13, 9, 0, 0);
        Jogador jogador9 = new Jogador(188, "Fabio", "Fabinho",
                getDataNascimentoAsDate("20/09/1997"),
                "Volante", 25, 8, 0, 0);
        Jogador jogador10 = new Jogador(153, "Vinicius", "Vini JR",
                getDataNascimentoAsDate("12/05/2000"),
                "Atacante", 16, 10, 1, 0);
        Jogador jogador11 = new Jogador(178, "Astolfo", "Astolfinho",
                getDataNascimentoAsDate("20/11/1997"),
                "Meia", 28, 8, 3, 0);


        List<Jogador> jogadores = Arrays.asList(jogador1, jogador2, jogador3, jogador4, jogador5, jogador6, jogador7,
                jogador8, jogador9, jogador10, jogador11);

        jogadores.forEach(jogador -> System.out.println(jogador.toString()));
    }

    private static Date getDataNascimentoAsDate
            (String dataNascimento) throws ParseException {
        return new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
    }
}
