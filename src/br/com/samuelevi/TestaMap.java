package br.com.samuelevi;

import java.util.HashMap;
import java.util.Map;

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
		
	}
}
