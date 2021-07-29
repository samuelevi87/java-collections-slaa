package br.com.samuelevi;

public class TestaBuscaAlunosCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando coleções do java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Probabilidade e estatística", 32));
		javaColecoes.adiciona(new Aula("Java Collections", 15));
		javaColecoes.adiciona(new Aula("Java Streams e Lambdas", 49));

		Aluno a1 = new Aluno("Samuel Levi", 3914);
		Aluno a2 = new Aluno("Paulo Levi", 1323);
		Aluno a3 = new Aluno("Daniela Alves", 1559);
		Aluno a4 = new Aluno("Antônio Alencar", 1324);
		Aluno a5 = new Aluno("Elaine Alencar", 2459);
		Aluno a6 = new Aluno("Laura Alencar", 2459);

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		javaColecoes.matricular(a4);
		javaColecoes.matricular(a5);
		javaColecoes.matricular(a6);
		
		javaColecoes.getAlunosSincronizados().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Quem é o aluno com Matrícula 1323?");
		Aluno busca = javaColecoes.buscarAluno(2459);
		System.out.println("Aluno: " + busca);

	}

}
