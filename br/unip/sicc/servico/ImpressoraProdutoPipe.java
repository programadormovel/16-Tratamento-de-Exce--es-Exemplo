package br.unip.sicc.servico;

public class ImpressoraProdutoPipe extends ImpressoraProduto{


	public void imprimeProduto(){
		if(valida()){
			System.out.println(produto.getDescricao()+"|"
                                + produto.getPreco());
		}
	}
	

}