package br.unip.sicc.entidades;

public class Produto {

	private String descricao; //null
	
	private double preco;

	private Fornecedor fornecedor;

	public static final double PRECO_MINIMO = 0.01;

	public Produto(String descricao, double preco) {
		this(descricao);
		this.setPreco(preco);
	}

	public Produto(String descricao) {
		this.setDescricao(descricao);
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setPreco(double preco) {
		if (preco < Produto.PRECO_MINIMO) {
			throw new IllegalArgumentException("Preco invalido: " + preco);
		} else {
			this.preco = preco;
		}
	}

	public double getPreco() {
		return this.preco;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	//Atencao ao tipo de retorno
	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public String toString(){
		return "Produto{descricao:"+ this.descricao + ", preco:" + this.preco + "}";
	}


	public void imprime(){
		System.out.println("Descricao: " + descricao + " custa " + preco + " reais");
		if(this.fornecedor!=null){
			this.fornecedor.imprime();
		}
	}

}
