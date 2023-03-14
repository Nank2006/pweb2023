package br.edu.ifgoiano.entidade;

import java.util.Date;

public class usuario {
   private String email;
   private String senha;
   private String nome;
   private Date datadeNascimento;
     
  public Integer obterIdade() {
	  return 0;
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

 public String getNome() {
	return nome;
 }

 public void setNome(String nome) {
	this.nome = nome;
 }

 public Date getDatadeNascimento() {
	return datadeNascimento;
 }

 public void setDatadeNascimento(Date datadeNascimento) {
	this.datadeNascimento = datadeNascimento;
 }
   
}
