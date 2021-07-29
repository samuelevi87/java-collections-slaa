package br.com.samuelevi;

import java.time.LocalDate;
import java.util.Collection;
import java.util.TreeSet;

public class TesteRecibo {
	
	public static void main(String[] args) {
		
		Recibo rec1 = new Recibo(12, 125.23, LocalDate.of(1999, 12, 21), "Samuel");
		Recibo rec2 = new Recibo(11, 225.23, LocalDate.of(1998, 01, 11), "Daniela");
		Recibo rec3 = new Recibo(10, 325.23, LocalDate.of(1997, 02, 01), "Paulo");
		Recibo rec4 = new Recibo(9, 425.23, LocalDate.of(1996, 03, 31), "Sérgio");
		
		Collection<Recibo> listaRecibos = new TreeSet<Recibo>();
		
		listaRecibos.add(rec1);
		listaRecibos.add(rec2);
		listaRecibos.add(rec3);
		listaRecibos.add(rec4);
		listaRecibos.add(rec4);
		
		System.out.println();
		System.out.println(listaRecibos);
		
		double sum = listaRecibos.stream().mapToDouble(Recibo::getValor).sum();
		System.out.println("Valor total: R$ " + sum);
		
		
		
	}

}
