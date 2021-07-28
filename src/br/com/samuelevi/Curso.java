package br.com.samuelevi;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {


	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "Curso: " + nome + ", tempo total: " + this.getTempoTotal() + " minutos.\n" + "Aulas:\n  " + this.aulas;
	}

}
