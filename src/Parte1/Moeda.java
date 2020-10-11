package Parte1;

import java.util.ArrayList;
import java.util.List;

public class Moeda implements Comparable<Moeda> {

	private double valor;


	
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	

	@Override
	  public int compareTo(Moeda outra) { 
		
		  return Double.compare(this.valor, outra.valor);  
	  }

	@Override
	public String toString() {
		return "Moeda [valor=" + valor + "]";
	}
	
	
	
	
	
	 

}
