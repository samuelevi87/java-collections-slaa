package br.com.samuelevi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaDeAula {
	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Revisitando as ArrayListis", 21);
		Aula aula2 = new Aula("Listas de objetos", 17);
		Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);
		
		List<Aula> aulas = new ArrayList<Aula>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		aulas.forEach(System.out::println);
		
		Collections.sort(aulas);
		System.out.println();
		aulas.forEach(System.out::println);

		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println();
		aulas.forEach(System.out::println);
		
		aulas.sort(Comparator.comparing(Aula::getTitulo));
		System.out.println();
		aulas.forEach(System.out::println);
		
		
		
	}

}
