package br.unip.sicc.entidades;

public class Fornecedor{
	private String nome;
	private String cnpj;

	public Fornecedor(String nome, String cnpj){
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	public String getCnpj(){
		return this.cnpj;
	}
	public String toString(){
		return "Fornecedor{nome:"+ this.nome + ", cnpj:" + this.cnpj + "}";
	}
	public void imprime(){
		System.out.println("Nome: "+ this.nome);
		System.out.println("CNPJ: "+ this.cnpj);
	}
}









