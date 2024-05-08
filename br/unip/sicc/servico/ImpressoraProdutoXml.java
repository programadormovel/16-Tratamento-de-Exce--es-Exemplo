package br.unip.sicc.servico;

public class ImpressoraProdutoXml  extends ImpressoraProduto{

	public void imprimeProduto(){
		if(valida()){
			System.out.println("<? xml>");
			System.out.print("\t<pessoa nome:\"" + produto.getDescricao());
			System.out.println("\" idade: "+ produto.getPreco()+ "/>");
		}
	}

}