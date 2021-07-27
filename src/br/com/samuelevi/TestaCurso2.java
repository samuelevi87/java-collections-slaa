package br.com.samuelevi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando cole��es do java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Probabilidade e estat�stica", 32));
		javaColecoes.adiciona(new Aula("Java Collections", 15));
		javaColecoes.adiciona(new Aula("Java Streams e Lambdas", 49));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		aulasImutaveis.forEach(System.out::println);
		
		List<Aula> aulas = new ArrayList<>(javaColecoes.getAulas());
		System.out.println();
		Collections.sort(aulas);
		aulas.forEach(System.out::println);
		
		int sum = aulas.stream().mapToInt(Aula::getTempo).sum();
		System.out.println("Minutos: " + sum);
		
		
		
	}

}
