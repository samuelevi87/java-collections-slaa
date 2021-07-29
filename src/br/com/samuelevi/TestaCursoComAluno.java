package br.com.samuelevi;

import java.util.Collections;

public class TestaCursoComAluno {

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
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		javaColecoes.matricular(a4);
		javaColecoes.matricular(a5);
		
		System.out.println("Todos os alunos matriculados:");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		System.out.println();
		
		System.out.println("Todos os alunos matriculados:");
		javaColecoes.getAlunosSincronizados().forEach(System.out::println);

		System.out.println();
		
		
		

	}

}
