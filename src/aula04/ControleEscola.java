package aula04;

import java.util.ArrayList;
import java.util.List;

public class ControleEscola {
    public static void main(String[] args) {

        Disciplina disciplina = new Disciplina("Portugues", 12);
        Disciplina disciplina1 = new Disciplina("Matematica", 8);
        Disciplina disciplina2 = new Disciplina("Ingles", 8);
        Disciplina disciplina3 = new Disciplina("Historia", 8);

        List<Disciplina> disciplinaList = new ArrayList<>();
        disciplinaList.add(disciplina);
        disciplinaList.add(disciplina1);
        disciplinaList.add(disciplina2);
        disciplinaList.add(disciplina3);

        Aluno aluno = new Aluno("Aurelio", 12343344, 123443, 13, "A", disciplinaList);


        Escola escola = new Escola("123", "PCC");
        escola.adicionarAluno(aluno);

        System.out.println(escola.visualizarAluno(0));

        System.out.println(aluno.calcularMedia());


        Aluno aluno2 = new Aluno("Bia", 1234, 6656, 13, "A", disciplinaList);

        escola.editarAluno(0, aluno2);

        System.out.println(escola.visualizarAluno(0));

        System.out.println(aluno.calcularMedia());

    }
}
