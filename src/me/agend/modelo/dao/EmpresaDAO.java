package me.agend.modelo.dao;

import java.sql.PreparedStatement;

import me.agend.modelo.Empresa;

public class EmpresaDAO extends FabricaConexao{
	private Empresa empresa;
	
	public EmpresaDAO() {
		this.getConexao();
	}
   /*
    public void inserir(Empresa empresa) throws Exception{
        open();
        try {    
        	
            String sql = "INSERT INTO endereco VALUES (null, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            
            
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, empresa.getNome());
            stmt.setString(2, empresa.getNomeFantasia());
            stmt.setString(3, empresa.getCpf());
            stmt.setString(4, empresa.getCnpj());
            stmt.setString(5, empresa.getEmail());
            stmt.setString(6, empresa.getEndereco());
            stmt.setString(7, empresa.getTelefone());
            stmt.setTime(8, empresa.getHorarioFechamento());
            stmt.setTime(9, empresa.getHorarioAbertura());
            stmt.setString(10, empresa.getNome());
            System.out.println(stmt.toString());
            stmt.execute();
            
            sql = "INSERT INTO pessoa VALUES (null,?,?,?,?,?,last_insert_id())";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, func.getCpf());
            stmt.setString(2, func.getNome());
            stmt.setString(3,func.getSenha());
            stmt.setString(4, func.getNascimentoBD());
            stmt.setString(5,func.getEmail());
            System.out.println(stmt.toString());
            stmt.execute();
            
            sql = "INSERT INTO funcionario VALUES (null, last_insert_id())";
            stmt = con.prepareStatement(sql);
            stmt.execute();
            System.out.println("Oi");
            close();
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
 
            
    }*/
	
}
