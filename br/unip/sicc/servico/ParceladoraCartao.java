package br.unip.sicc.servico;

import br.unip.sicc.entidades.Produto;

public class ParceladoraCartao implements Parceladora{
	private double juros = 0.03;
	private int qtdeParcelas = 12;
	public static final double PARCELA_MINIMA = 5.0;

	// throws e throw devem ser acompanhados de tipos derivados de java.lang.Throwable
        /*
         * a excecao reportada (throws ParcelamentoException) deve ser definida no metodo sobreescrito
         * Ver interface Parceladora
         */
	public PlanoDePagamento parcela(Produto produto) throws ParcelamentoException{
		double valorParcela = 
			produto.getPreco()/qtdeParcelas*(1+juros);
		if(valorParcela < PARCELA_MINIMA){ 
			// throw e usado para lancar o objeto que representa a excecao
			throw new ParcelamentoException("Parcela invalida: " + valorParcela);
		}
		PlanoDePagamento plano = 
			new PlanoDePagamento("Cartao de credito", qtdeParcelas, valorParcela); 
		return plano;
	}
}