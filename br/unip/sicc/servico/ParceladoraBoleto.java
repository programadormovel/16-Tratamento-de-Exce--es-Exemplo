package br.unip.sicc.servico;

import br.unip.sicc.entidades.Produto;

public class ParceladoraBoleto implements Parceladora{
    
        private double juros = 0.05;
        private int qtdeParcelas = 10;
	private double custoBoleto = 1.49;
        
	/* 
         * nao e obrigatorio lancar uma excessao 
	 * quando o metodo sobreescrito lanca uma excecao
         * Ver interface Parceladora
         */
        public PlanoDePagamento parcela(Produto produto){
            double valorParcela = produto.getPreco()/qtdeParcelas*(1+juros) + custoBoleto;
            PlanoDePagamento plano = new PlanoDePagamento("Boleto", qtdeParcelas, valorParcela);
            return plano;
        }
        
    }