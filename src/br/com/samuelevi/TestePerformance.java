package br.com.samuelevi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class TestePerformance {

	public static void main(String[] args) {
//		Collection<Integer> numeros = new HashSet<Integer>();
//		Collection<Integer> numeros = new ArrayList<Integer>();
		Collection<Integer> numeros = new LinkedList<Integer>();
		long inicio1 = System.currentTimeMillis();

		for (int i = 1; i < 100000; i++) {
			numeros.add(i);
		}
		long fim1 = System.currentTimeMillis();

		long inicio2 = System.currentTimeMillis();
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim2 = System.currentTimeMillis();

		long tempoExecucaoInsercao = fim1 - inicio1;
		long tempoExecucaoConsulta = fim2 - inicio2;
		
		System.out.println("Tempo gasto na inserção: " + tempoExecucaoInsercao + " milissegundos.");
		System.out.println("Tempo gasto na consulta: " + tempoExecucaoConsulta + " milissegundos.");
		System.out.println("Tempo gasto no total: " + (tempoExecucaoConsulta+tempoExecucaoInsercao) + " milissegundos.");

	}

}
