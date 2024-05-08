package br.unip.sicc.entidades;

public class ProdutoDigital extends Produto {
	
	private double tamanho; //em bytes
	private Unidade unidade = Unidade.B;

	public ProdutoDigital(String descricao, double preco) {
		super(descricao, preco);//PCC chamada ao construtor da superclasse
	}

	public ProdutoDigital(String descricao) {
		super(descricao);//PCC chamada ao construtor da superclasse
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public Unidade getUnidade() {
		return this.unidade;
	}

	public void imprime() {
		super.imprime();
		System.out.print("Tamanho: " + this.tamanho);
		System.out.println(this.getUnidade().getDescricao());
	}
	public String toString(){
		return "ProdutoDigital{descricao:"+ this.getDescricao() + ", preco:" + this.getPreco() 
					+ ", tamanho:" + this.tamanho + " " + this.unidade.getDescricao() + "}";
	}

}
