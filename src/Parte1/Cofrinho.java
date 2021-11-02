package Parte1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.DoublePredicate;

public class Cofrinho {
	
	private static List<Moeda> listaMoedas;
	
	public Cofrinho() {
		Cofrinho.listaMoedas = new ArrayList<Moeda>();
	}
	
	public int quantidadeDeMoedas() {
		int QuantidadeMoedas = Cofrinho.listaMoedas.size();
		//asdasd
		
		return QuantidadeMoedas;
	}

	
	@SuppressWarnings("null")
	public double maiorMoeda() {
		
		double maior = 0.0;

		for (Moeda moeda : listaMoedas) {
			double valorNovo = moeda.getValor();
			
			if (maior < valorNovo) {
				maior = valorNovo;
				
				//Teste merge
			}
		}

		return maior;
	}
	
	
	public double totalArmazenado() {
		double total = 0;
		//Teste merge
		String teste ="asdasd";
		
		teste.concat(teste);
		
		for (Moeda moeda : listaMoedas) {
			total =+ moeda.getValor();
		}
		
		return total;
		
	}
	
	public void adicionaMoedas(Moeda moeda) {

		Cofrinho.listaMoedas.add(moeda);
		
		}

	public List<Moeda> getMoeda() {
		
		return Cofrinho.listaMoedas;
	}
	
	
	//Assumindo que a pessoa informa qual a moeda ela quer saber
	public String quantidadeMoedasPorValor() {
				
		int total = 0;
		int moeda05 = 0;
		int moeda10 = 0;
		int moeda25 = 0;
		int moeda50 = 0;
		int moeda1 = 0;
		String msg = "";
		
		for (Moeda moeda : listaMoedas) {
			String testa = Double.toString(moeda.getValor());

			switch (testa) {
			case "0.1":
				moeda10++;
				break;

			case "0.05":
				moeda05++;
				break;

			case "0.25":
				moeda25++;
				break;

			case "0.5":
				moeda50++;
				break;

			case "1.0":
				moeda1++;
				break;

			}
		}
		msg = "Moedas de 0.05 ->"+moeda05 + " \n Moedas de 0.10 ->" +moeda10+" \n Moedas de 0.25 ->" +moeda25+" \n Moedas de 0.50 ->" +moeda50+" \n Moedas de 1 ->" +moeda1;
		
		return msg;
	}
	
	

	
	public void adiciona300Moedas() {
		while(listaMoedas.size() < 300) {
			listaMoedas.add(new Moeda(Cofrinho.criaMoeda()));
		}
		//System.out.println(listaMoedas);
	}

	public static double criaMoeda() {

		Random random = new Random();
		DecimalFormat formato = new DecimalFormat("#.##");
		double valor = 0.0;

		while (valor == 0.0) {
			String valorRandom = formato.format(random.nextDouble());
			double valorRandomDouble = Double.valueOf(valorRandom.replace(",", "."));
			if (valorRandomDouble == 0.05) {
				valor = valorRandomDouble;
			} else if (valorRandomDouble == 0.1) {
				valor = valorRandomDouble;
			} else if (valorRandomDouble == 0.25) {
				valor = valorRandomDouble;
			} else if (valorRandomDouble == 0.5) {
				valor = valorRandomDouble;
			} else if (valorRandomDouble == 1) {
				valor = valorRandomDouble;
			}
		}

		return valor;
	}
	

}	
	
	
