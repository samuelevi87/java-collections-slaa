package br.com.samuelevi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		System.out.println();

		aulas.forEach(System.out::println);

		aulas.remove(0);

		System.out.println();
		aulas.forEach(System.out::println);

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		System.out.println("==>> A primeira aula é: " + aulas.get(0));
		System.out.println();

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("--> aula: " + aulas.get(i));
		}

		System.out.println("**\n");

		aulas.forEach(aula -> {
			System.out.println("percorrendo:");
			System.out.println("Aula: " + aula);
		});

		aulas.add("Aumetando o nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);

		System.out.println("Depois de ordenado:");
		System.out.println(aulas);

		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
		String curso2 = "Zpache Camel";
		String curso3 = "Qertificacao Java SE 8 Programmer I";

		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		cursos.remove(0);
		cursos.add(aula1);
		cursos.add(aula2);
		cursos.add(aula3);
		System.out.println();

		cursos.forEach(cr -> System.out.println(cr));
		System.out.println();
		System.out.println("**");
		System.out.println("O primeiro curso da lista é o " + cursos.get(0));
		System.out.println("**");
		
		Collections.sort(cursos);
		
		cursos.forEach(System.out::println);
		
		
	}

}
