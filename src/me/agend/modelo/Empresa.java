
package me.agend.modelo;

import java.sql.Time;

public class Empresa {
	private String nome;
	private String nomeFantasia;
	private String cpf;
	private String cnpj;
	private Time horarioAbertura;
	private Time horarioFechamento;
	private String endereco;
	private String email;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Time getHorarioAbertura() {
		return horarioAbertura;
	}
	public void setHorarioAbertura(Time horarioAbertura) {
		this.horarioAbertura = horarioAbertura;
	}
	public Time getHorarioFechamento() {
		return horarioFechamento;
	}
	public void setHorarioFechamento(Time horarioFechamento) {
		this.horarioFechamento = horarioFechamento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
