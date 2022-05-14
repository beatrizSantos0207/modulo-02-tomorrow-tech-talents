package aula04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Escola {

    public String nome;

    private List<Aluno> alunos = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void editarAluno(int posicao, Aluno dadosEdicao) {
        Aluno alunoExistente = this.alunos.get(posicao);
        alunoExistente.setNome(dadosEdicao.getNome());
        alunoExistente.setCpf(dadosEdicao.getCpf());
        alunoExistente.setIdade(dadosEdicao.getIdade());
        alunoExistente.setTurma(dadosEdicao.getTurma());
        alunoExistente.setNotasPorDisciplina(dadosEdicao.getNotasPorDisciplina());


    }

    public void editarFuncionario(int posicao, Funcionario dadosEdicao) {
        Funcionario funcionarioExistente = this.funcionarios.get(posicao);
        funcionarioExistente.setNome(dadosEdicao.getNome());
        funcionarioExistente.setCpf(dadosEdicao.getCpf());
        funcionarioExistente.setRg(dadosEdicao.getRg());
        funcionarioExistente.setCargo(dadosEdicao.getCargo());
        funcionarioExistente.setSalario(dadosEdicao.getSalario());
    }

    public void editarProfessor(int posicao, Professor dadosEdicao) {
        Professor professorExistente = this.professores.get(posicao);
        professorExistente.setNome(dadosEdicao.getNome());
        professorExistente.setCpf(dadosEdicao.getCpf());
        professorExistente.setRg(dadosEdicao.getRg());
        professorExistente.setCargo(dadosEdicao.getCargo());
        professorExistente.setSalario(dadosEdicao.getSalario());
        professorExistente.setTurmas(dadosEdicao.getTurmas());
        professorExistente.setDisciplinas(dadosEdicao.disciplinas);
    }

    public void excluirAluno(Long cpf) {
        this.alunos = this.alunos.stream().filter(aluno ->
                        !cpf.equals(aluno.getCpf()))
                .collect(Collectors.toList());
    }

    public void excluirFuncionario(Long cpf) {
        this.funcionarios = this.funcionarios.stream().filter(funcionario ->
                        !cpf.equals(funcionario.getCpf()))
                .collect(Collectors.toList());
    }

    public void excluirProfessor(Long cpf) {
        this.professores = this.professores.stream().filter(professor ->
                        !cpf.equals(professor.getCpf()))
                .collect(Collectors.toList());
    }

    List<Aluno> listaAlunos() {
        return alunos;
    }

    public List<Funcionario> listaFuncionarios() {
        return funcionarios;
    }

    public List<Professor> listaProfessores() {
        return professores;
    }

    public String visualizarAluno(int posicao) {
        return this.alunos.get(posicao).toString();
    }

    public String visualizarFuncionario(int posicao) {
        return this.funcionarios.get(posicao).toString();
    }

    public String visualizarProfessor(int posicao) {
        return this.professores.get(posicao).toString();
    }


}
