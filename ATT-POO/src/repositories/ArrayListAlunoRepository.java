package repositories;

import java.util.ArrayList;
import java.util.List;

import models.Aluno;
import contracts.iAlunoRepository;
import exceptions.AlunoNaoEncontradoException;
import exceptions.MatriculaInvalidaException;

public class ArrayListAlunoRepository implements iAlunoRepository {
    
    private List<Aluno> alunos;

    public ArrayListAlunoRepository() {
        alunos = new ArrayList<Aluno>();
    }

    public Aluno buscar(String nome) throws AlunoNaoEncontradoException {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        throw new AlunoNaoEncontradoException("Aluno não encontrado: " + nome);
    }

    public void adicionar(Aluno aluno) {
        if (aluno.getMatricula().length() == 10) {
            alunos.add(aluno);
        } else {
            try {
                throw new MatriculaInvalidaException("Matricula com menos de 10 números");
            } catch (MatriculaInvalidaException e) {
                e.printStackTrace();
            }
        }
    }

    public void remover(Aluno aluno) {
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
        }
    }

    public List<Aluno> listar() {
        return alunos;
    }
}
