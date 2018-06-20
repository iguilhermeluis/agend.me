package me.agend.modelo;

public class Cliente extends Pessoa {
	
	private String login;
	private String senha;
	
	
	
	public Cliente(String nome, String email, char sexo, String telefone) {
		super(nome, email, sexo, telefone);
		// TODO Auto-generated constructor stub
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
