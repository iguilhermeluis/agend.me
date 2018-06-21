package me.agend.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FabricaConexao {
    protected PreparedStatement stmt; //Manipular as operações do DB (executar o insert,select,update,delete)
    protected ResultSet rs;           //Manipular os objetos da consulta do DB.
    protected Connection conexao; //Objeto de conexão com o DB, gereciar a conexão
	
	public FabricaConexao() {
		conexao = null;
	}
	
	public Connection getConexao(){
		
		if(conexao == null){
			
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				conexao = DriverManager.getConnection("jdbc:mysql://localhost/agendamento", "root", "");
				
				return conexao;
				
			} catch(ClassNotFoundException e){
				System.out.println("Falha ao se connectar");
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
	
	 protected void close() throws Exception{
		 conexao.close();
	  }
	
}
