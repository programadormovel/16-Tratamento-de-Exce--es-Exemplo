package br.unip.sicc.servico;

import br.unip.sicc.entidades.Produto;

public interface Parceladora {
    /*
     * o metodo da interface deve reportar o lancamento da excecao (throws)
     * para que as suas implementacoes possam lancar a excecao  
     * e possivel reportar o lancamento de mais de uma excecao separando por vírgula
     * ex: throws ParcelamentoException, OutraException   
     * throws deve ser acompanhados de tipos derivados de java.lang.Throwable
     */
    public abstract PlanoDePagamento parcela(Produto produto) throws ParcelamentoException;
}
