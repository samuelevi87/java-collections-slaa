package br.com.samuelevi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<String>();
		alunos.add("Samuel Levi");
		alunos.add("Paulo Levi");
		alunos.add("Daniela Alves");
		alunos.add("Vanderlei Kleinschimidt");
		alunos.add("Jonata Caetano");
		alunos.add("Lucas Nunes");
		alunos.add("Janaina Mai");
		alunos.add("Victor Peres");
		
		System.out.println(alunos);
		System.out.println();
		boolean samuelEstaMatriculado = alunos.contains("Samuel Levi");
		System.out.println(samuelEstaMatriculado);
		System.out.println();
		System.out.println("Alunos antes da tentativa: " + alunos.size());
		boolean added = alunos.add("Lucas Nunes");
		System.out.println("Adicionar Lucas Nunes deu certo? " + added);
		System.out.println("Alunos depois da tentativa: " + alunos.size());
		System.out.println();
		System.out.println();
		System.out.println("Alunos antes da tentativa: " + alunos.size());
		boolean added2 = alunos.add("Lucas nunes");
		System.out.println("Adicionar Lucas nunes deu certo? " + added2);
		System.out.println("Alunos depois da tentativa: " + alunos.size());
		
		List<String> alunosLista = new ArrayList<>(alunos);
		
//		Collections.sort(alunosLista);
//		alunosLista.forEach(System.out::println);
//		System.out.println();
//		Collections.reverse(alunosLista);
//		alunosLista.forEach(System.out::println);
		
	}

}
