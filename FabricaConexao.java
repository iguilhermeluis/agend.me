package me.agend.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	private Connection conexao;
	
	public FabricaConexao() {
		conexao = null;
	}
	
	public Connection getConexao(){
		
		if(conexao == null){
			
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				conexao = DriveManager.getConnection("jdbc:mysql://localhost/agendamento", "root", "");
				
				return conexao;
				
			} catch(ClassNotFoundException e){
				System.out.println("Falha");
				e.printStackTrace();
				return null;
			} catch (SQLException e){
				System.out.println("Falha ao se conectar");
				e.printStackTrace();
				return null;
			}
			
		} else {
			
			return conexao;
		}
		
	}
	
}
