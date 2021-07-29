package br.com.samuelevi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		List<Aluno> list = new ArrayList<>(alunos);
		
		Collections.sort(list);
		
		Iterator<Aluno> iterador = list.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(">>" + proximo);
		}

		System.out.println();
		for (Aluno aluno : alunos) {
			System.out.println("-->" + aluno);
		}
		
	}

}
