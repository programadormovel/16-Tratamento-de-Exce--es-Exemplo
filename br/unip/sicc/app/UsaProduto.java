package br.unip.sicc.app;

import br.unip.sicc.entidades.Produto;
import br.unip.sicc.servico.*;

public class UsaProduto {

    public static void main(String[] args){

        Produto mochila = new Produto("Mochila grande", 90.0);
        mochila.imprime();

	try{
        	Parceladora parceladoraCartao = new ParceladoraCartao();
	        PlanoDePagamento planoCartao = parceladoraCartao.parcela(mochila);
        	planoCartao.imprime();
	}catch(ParcelamentoException ex){
		System.out.println("Nao foi possivel parcelar no cartao ");
		System.out.println(ex.getMessage());
	}

	try{
        	Parceladora parceladoraCheque = new ParceladoraCheque();
	        PlanoDePagamento planoCheque = parceladoraCheque.parcela(mochila);
        	planoCheque.imprime();
	}catch(ParcelamentoException ex){
		System.out.println("Nao foi possivel parcelar no cheque ");
		System.out.println(ex.getMessage());
	}

	try{
	        Parceladora parceladoraBoleto = new ParceladoraBoleto();
        	PlanoDePagamento planoBoleto = parceladoraBoleto.parcela(mochila);
	        planoBoleto.imprime();
	}catch(ParcelamentoException ex){
		System.out.println("Nao foi possivel parcelar no boleto ");
		System.out.println(ex.getMessage());
	}
    }
}





