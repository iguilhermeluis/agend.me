package me.agend.modelo;

public abstract class Pessoa {
	
	private String nome; 
	private String email; 
	private char sexo; 
	private String telefone;
	
	public Pessoa(String nome, String email, char sexo, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 
	
	
}
