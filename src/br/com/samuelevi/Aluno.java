package br.com.samuelevi;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return nome + ", Matr�cula: " + numeroMatricula + ".";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Aluno))
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && numeroMatricula == other.numeroMatricula;
	}

	@Override
	public int compareTo(Aluno aluno) {
		return this.getNome().compareTo(aluno.nome);
	}
	
	

}
