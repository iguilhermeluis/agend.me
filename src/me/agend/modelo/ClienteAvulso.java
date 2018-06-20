package me.agend.modelo;

public class ClienteAvulso extends Cliente {
	
	private String cpf;
	
	public ClienteAvulso(String nome, String email, char sexo, String telefone) {
		super(nome, email, sexo, telefone);
		// TODO Auto-generated constructor stub
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
