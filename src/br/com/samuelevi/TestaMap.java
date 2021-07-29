package br.com.samuelevi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestaMap {

	public static void main(String[] args) {

		Map<Integer, String> pessoas = new HashMap<Integer, String>();

		pessoas.put(15, "Samuel Levi Alves");
		pessoas.put(05, "Daniela Alves");
		pessoas.put(25, "Paulo Levi Alves");
		pessoas.put(35, "Antônio Alencar");
		pessoas.put(16, "Elaine Cristina");
		pessoas.put(18, "Laura Alencar");

		pessoas.keySet().forEach(key -> System.out.println(pessoas.get(key)));
		System.out.println();
		
		/**
		 * Listando todas as chaves do mapa
		 */
		Set<Integer> chaves = pessoas.keySet();    
		for (Integer key : chaves) {
		    System.out.println(key);
		}
		
		/**
		 * Listando todos os valores do mapa
		 */
		System.out.println();
		Collection<String> nomes = pessoas.values();
		nomes.forEach(System.out::println);
		
		/**
		 * Listando as associações de <chave, valor> existentes no mapa.
		 */
		System.out.println();
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for (Entry<Integer, String> associacao : associacoes) {
			System.out.println(associacao.getKey() + " " + associacao.getValue());			
		}
	}
}
