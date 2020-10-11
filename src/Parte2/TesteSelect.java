package Parte2;

import java.util.ArrayList;
import java.util.List;

public class TesteSelect {

	public static void main(String[] args) {
		FuncionarioDAO dao = new FuncionarioDAO();
		List<Funcionario> lista = new ArrayList<>();
		lista = dao.getFuncionario();
		
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario);
		}
	}

}