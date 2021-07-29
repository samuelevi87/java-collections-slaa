package br.com.samuelevi;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();

	private Set<Aluno> alunos = new HashSet<Aluno>();
	private Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);


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
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public Set<Aluno> getAlunosSincronizados() {
		return Collections.unmodifiableSet(alunosSincronizados);
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

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);		
	}

	public boolean isMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	@Override
	public int hashCode() {
		return Objects.hash(instrutor, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Curso))
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(instrutor, other.instrutor) && Objects.equals(nome, other.nome);
	}
	
	
	
	

}
