package br.com.samuelevi;

import java.time.LocalDate;
import java.util.Objects;

public class Recibo implements Comparable<Recibo> {
	private Integer numeroRecibo;
	private double valor;
	private LocalDate data;
	private String nomePagador;

	public Recibo(int numeroRecibo, double valor, LocalDate data, String nomePagador) {
		this.numeroRecibo = numeroRecibo;
		this.valor = valor;
		this.data = data;
		this.nomePagador = nomePagador;
	}

	public Integer getNumeroRecibo() {
		return numeroRecibo;
	}

	public void setNumeroRecibo(Integer numeroRecibo) {
		this.numeroRecibo = numeroRecibo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getNomePagador() {
		return nomePagador;
	}

	public void setNomePagador(String nomePagador) {
		this.nomePagador = nomePagador;
	}

	@Override
	public int compareTo(Recibo recibo) {
		return this.getNumeroRecibo().compareTo(recibo.numeroRecibo);
	}

	@Override
	public String toString() {
		return "Recibo Nº: " + numeroRecibo + ", valor: R$ " + valor + ", Data de Pgto: " + data + ", Cliente: "
				+ nomePagador + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, nomePagador, numeroRecibo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Recibo)) {
			return false;
		}
		Recibo other = (Recibo) obj;
		return Objects.equals(data, other.data) && Objects.equals(nomePagador, other.nomePagador)
				&& numeroRecibo == other.numeroRecibo
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

}
