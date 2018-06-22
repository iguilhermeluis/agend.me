package me.agend.controller;

import me.agend.modelo.Empresa;
import me.agend.modelo.dao.EmpresaDAO;

public class Principal {
	public static void main(String[] args) throws Exception {
		Empresa empresa = new Empresa();
		empresa.setNome("Empresa A");
		empresa.setNomeFantasia("Emp A");
		empresa.setEmail("contato@empresa.com");
		empresa.setCnpj("cpf");
		empresa.setCpf("123-456.98/657");
		empresa.setEndereco("endereço");
		empresa.setHorarioAbertura("10:00");
		empresa.setHorarioFechamento("10:45");
	
		EmpresaDAO dao = new EmpresaDAO();
		dao.getConexao();
		dao.inserir(empresa);
	}
}
