package Parte1;

public class testaCofrinho {

	public static void main(String arg[]) {
		Cofrinho cofrinho = new Cofrinho() ;
//		Moeda moeda = new Moeda(0.25);
		cofrinho.adiciona300Moedas();
		
		System.out.println("300 moedas adicionadas");
		
		//cofrinho.adicionaMoedas(moeda);
		//System.out.println("Adiciona -> "+ cofrinho.getMoeda());
		
		System.out.println();
		System.out.println("Total -> "+ cofrinho.totalArmazenado());
		
		System.out.println();
		System.out.println("Quantidade De Moedas: -> "+ cofrinho.quantidadeDeMoedas());
		
		System.out.println();
		System.out.println("A maior Moeda é: -> "+ cofrinho.maiorMoeda());
	
		System.out.println();
		System.out.println();
		System.out.println("A maior Moeda é: -> "+ cofrinho.quantidadeMoedasPorValor());
		
		
	}
}


