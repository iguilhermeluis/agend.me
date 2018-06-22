package me.agend.modelo.dao;

import java.sql.PreparedStatement;

import me.agend.modelo.Empresa;


public class EmpresaDAO extends FabricaConexao{
	
	public EmpresaDAO() {
		this.getConexao();
	}
	
   
    public void inserir(Empresa empresa) throws Exception{
   
    	try {    
        	String sql = "INSERT INTO empresa VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, empresa.getNome());
            stmt.setString(2, empresa.getNomeFantasia());
            stmt.setString(3, empresa.getCpf());
            stmt.setString(4, empresa.getCnpj());
            stmt.setString(5, empresa.getEmail());
            stmt.setString(6, empresa.getEndereco());
            stmt.setString(7, empresa.getTelefone());
            stmt.setString(8, empresa.getHorarioFechamento());
            stmt.setString(9, empresa.getHorarioAbertura());
            stmt.setString(10, empresa.getNome());
            System.out.println(stmt.toString());
            stmt.execute();
            close();
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
 
            
    }
	
}
