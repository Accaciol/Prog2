package Parte2;

public class TesteInsert {

	public static void main(String[] args) {
		//Funcionario p1 = new Funcionario( 105, "nome", "email", null , "senha" );
		Funcionario p2 = new Funcionario(107, "LucasTest", "Lucas1@gmail", null, "123");
		//Funcionario p3 = new Funcionario(107, "Caneca decorativa", 400, 18.80);
		//Funcionario p4 = new Funcionario(108, "A Caneca de prata", 770, 38.80);
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		//dao.adiciona(p1);
		dao.adiciona(p2);
		//dao.adiciona(p4);
		
	}

}
