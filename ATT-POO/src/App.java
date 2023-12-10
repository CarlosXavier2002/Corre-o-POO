import java.util.List;

import contracts.iAlunoRepository;
import exceptions.AlunoNaoEncontradoException;
import exceptions.MatriculaInvalidaException;
import repositories.ArrayListAlunoRepository;
import models.Aluno;


public class App {
    public static void main(String[] args) throws AlunoNaoEncontradoException {
        try {
            iAlunoRepository repository = new ArrayListAlunoRepository();

            repository.adicionar(new Aluno("Elba Medeiros Ramalho", "4444444444"));
            repository.adicionar(new Aluno("Jose Carlos dos Anjos Xavier", "1111111111"));
            repository.adicionar(new Aluno("Pedrina Vitoria", "2222222222"));
            repository.adicionar(new Aluno("Beatriz Xavier", "3333333333"));
            repository.adicionar(new Aluno("ERIck neuman", "6666666666"));
            
            List<Aluno> listaAlunos = repository.listar();
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : listaAlunos) {
                System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
            }

            Aluno alunoBuscado = repository.buscar("Rafael Bernardo Marques");
            System.out.println("\nAluno buscado: " + alunoBuscado.getNome() + ", Matrícula: " + alunoBuscado.getMatricula());

            Aluno excluiraluno = repository.buscar("Laila Fenandes Lima");
            System.out.println("\nAluno apagado: " + excluiraluno.getNome() + ", Matrícula: " + excluiraluno.getMatricula());
            repository.remover(excluiraluno);

            List<Aluno> alunosRestantes = repository.listar();
            System.out.println("\nLista de Alunos atualizada:");
            for (Aluno aluno : alunosRestantes) {
                System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
            }
        } catch (MatriculaInvalidaException e) {
            e.printStackTrace();
        }
    }
}
