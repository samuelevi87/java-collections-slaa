package br.com.samuelevi;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando coleções do java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Probabilidade e estatística", 32));
		javaColecoes.adiciona(new Aula("Java Collections", 15));
		javaColecoes.adiciona(new Aula("Java Streams e Lambdas", 49));
		
		System.out.println(javaColecoes.getAulas());
		
		aulas.forEach(System.out::println);
		
		
	}

}
