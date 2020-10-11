package Parte2;

public class TestaApagar {

	public static void main(String[] args) {
		FuncionarioDAO dao = new FuncionarioDAO();
		
		Funcionario p = new Funcionario();
		
		p.setMatricula(105);
		
		dao.apaga(p);

	}

}
