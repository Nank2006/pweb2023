package br.edu.ifgoiano.entidade;

import java.util.Date;

public class usuario {

	private String nome;
	 private String email;
	 private String senha;
	 private String senha2;
	 private Date data;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha2() {
		return senha2;
	}
	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

}


