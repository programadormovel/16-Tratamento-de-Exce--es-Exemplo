package br.unip.sicc.servico;

import br.unip.sicc.entidades.Produto;

public abstract class ImpressoraProduto {
    
    protected Produto produto;

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public abstract void imprimeProduto();

    protected boolean valida() {
        if (produto != null && produto.getDescricao() != null) {
            return true;
        } else {
            System.out.println("Nenhuma pessoa configurada");
            return false;
        }
    }
}
