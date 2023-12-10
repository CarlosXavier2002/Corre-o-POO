## Desenvolver um programa em Java para cadastrar alunos

# Descrição

Desenvolver um programa em Java para cadastrar alunos.
O objetivo desse programa é criar uma lista de alunos usando um ArrayList, implementando um repositório de alunos. 
O repositório deve ser capaz de adicionar, remover, buscar e listar alunos. 
Abaixo estão os requisitos do programa que deve ser construído:

1. Implementar uma classe Aluno que deve possuir os atributos privados nome e matricula.

2. A classe aluno deve ter um construtor que instancie a classe com o nome e a matricula do aluno.

3. Implementar os getters e setters para o nome e a matricula do aluno.

4. Criar uma interface chamada iAlunoRepository que possui os seguintes métodos:
void adicionar(Aluno aluno); // Adicionar um aluno
void remover(Aluno aluno); // Remove um aluno
Aluno buscar(String nome); // Busca o aluno pelo nome e retorna o Aluno
List<Aluno> listar(); // Lista os alunos adicionado

5. Criar a classe ArrayListAlunoRepository que implementa a interface iAlunoRepository

6. No main do App.java executar as seguintes operações:
Instanciar a classe ArrayListAlunoRepository usando a interface iAlunoRepository como referencia;
Adicionar 5 alunos a lista
Listar os aluno
Buscar e retornar um aluno que está na lista;
Remover um aluno;
Listar os alunos restantes.

7. Criar a exceção AlunoNaoEncontradoException(caso o aluno não seja encontrado) e MatriculaInvalidaException(caso o tamanho da matricula seja diferente de 10 números).
