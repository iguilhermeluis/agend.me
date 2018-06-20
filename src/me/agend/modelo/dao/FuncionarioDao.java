package me.agend.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import me.agend.modelo.Funcionario;

public class FuncionarioDao {
	private Connection conexao;
	
	public FuncionarioDao(){
		
	}
	
	public FuncionarioDao(Connection conexao){
		this.conexao = conexao;
	}
	
	public boolean inserirFuncionario(Funcionario funcionario){
		String sql = "insert into funcionario(nome,email,telefone,endereco,dataNascimento,sexo,cpf,dataAdmissao,cargo,horarioEntrada,horarioSaida)" 
				+ "values(?,?,?,?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getEmail());
			stmt.setString(3,funcionario.getTelefone());
			stmt.setString(4,funcionario.getEndereco());
			stmt.setString(5, funcionario.getDataNascimento());
			stmt.setString(6, funcionario.getSexo());
			stmt.setString(7, funcionario.getCpf());
			stmt.setString(8, funcionario.getDataAdmissao());
			stmt.setString(9, funcionario.getCargo());
			stmt.setString(10, funcionario.getHorarioEntrada());
			stmt.setString(11, funcionario.getHorarioSaida());
			
			stmt.execute();
			stmt.close();
			
			return true;
			
		}catch(SQLException e){
			System.out.println("Não foi possivel registrar os dados do aluno");
			e.printStackTrace();
			
			return false;
		}
	}
}
