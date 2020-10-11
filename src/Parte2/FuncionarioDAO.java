package Parte2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
	private Connection con;
	
	public FuncionarioDAO() {
		con = new ConnectionFactory().getConnection();
	}
	
	
	public void adiciona(Funcionario funcionario) {
		String sql = "INSERT INTO funcionarios VALUES (?,?,?,?,?);";
				
		try (PreparedStatement stmt = con.prepareStatement(sql)){
			
			stmt.setInt(1, funcionario.getMatricula());
			stmt.setString(2, funcionario.getNome());
			stmt.setString(3, funcionario.getEmail());
			stmt.setDate(4, funcionario.getDt_nasc());
			stmt.setString(5, funcionario.getSenha());
			
			stmt.execute();
			
			System.out.println("Produto gravado!");
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			System.out.println("Fim da gravação!");
		}
	}
	
	
	
	public void atualiza(Funcionario funcionario) {
		String sql = "UPDATE funcionarios SET descricao=?, quantidade=?, preco=? WHERE codigo=?;";
		
		try(PreparedStatement stmt = con.prepareStatement(sql);){
			
			stmt.setInt(1, funcionario.getMatricula());
			stmt.setString(2, funcionario.getNome());
			stmt.setString(3, funcionario.getEmail());
			stmt.setDate(4, funcionario.getDt_nasc());
			stmt.setString(5, funcionario.getSenha());
			
			stmt.execute();
			
			System.out.println("Funcionario alterado!");
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	
	public List<Funcionario> getFuncionario(){
		List<Funcionario> funcionario = new ArrayList<>();
		String sql = "SELECT * FROM funcionarios";
		

		try(PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();){
						
			while(rs.next()) {
				Funcionario fun = new Funcionario();
				fun.setMatricula(rs.getInt("matricula"));
				fun.setNome(rs.getString("nome"));
				fun.setEmail(rs.getString("email"));
				fun.setDt_nasc(rs.getDate("dt_nasc"));
				fun.setSenha(rs.getString("senha"));
				
				funcionario.add(fun);
			}			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return funcionario;
	}
	
	
	
	
	
	public void apaga(Funcionario funcionario) {
		String sql = "DELETE FROM funcionarios WHERE matricula= ?;";

		try(PreparedStatement stmt = con.prepareStatement(sql);){
			
			stmt.setInt(1, funcionario.getMatricula());
			stmt.execute();
			System.out.println("Funcionario removido!");
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	
	
}
