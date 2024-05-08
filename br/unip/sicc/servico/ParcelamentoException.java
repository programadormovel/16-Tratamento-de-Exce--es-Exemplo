package br.unip.sicc.servico;

public class ParcelamentoException extends Exception{
	
	public ParcelamentoException(){
		super();
	}
	public ParcelamentoException(String message){
		super(message);
	}
	public ParcelamentoException (String message, Throwable cause){
		super(message, cause);
	}

}