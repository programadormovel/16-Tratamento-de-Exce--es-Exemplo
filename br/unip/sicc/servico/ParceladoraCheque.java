package br.unip.sicc.servico;

import br.unip.sicc.entidades.Produto;

public class ParceladoraCheque implements Parceladora{
        private double juros = 0.04;
        private int qtdeParcelas = 6;
	public static final double PARCELA_MINIMA = 20.0;
        
	// throws e throw devem ser acompanhados de tipos derivados de java.lang.Throwable
        /*
         * a excecao reportada (throws ParcelamentoException) deve ser definida 
         * no metodo sobreescrito
         * Ver interface Parceladora
         */
        public PlanoDePagamento parcela(Produto produto) throws ParcelamentoException{

            double valorParcela = 
		produto.getPreco()/qtdeParcelas*(1+juros);
	    if(valorParcela<PARCELA_MINIMA){
		// throw e usado para lancar o objeto que representa a excecao
		throw new ParcelamentoException("Parcela muito baixa, minima e " + PARCELA_MINIMA);
	    }
	    PlanoDePagamento plano = new PlanoDePagamento("Cheque", qtdeParcelas, valorParcela);
            return plano;
        }
        
    }

