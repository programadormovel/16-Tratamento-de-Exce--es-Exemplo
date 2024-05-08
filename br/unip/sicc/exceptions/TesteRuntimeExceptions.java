package br.unip.sicc.exceptions;

import br.unip.sicc.entidades.Produto;

//RuntimeException e suas subclasses sao unchecked
//em varios catchs a ordem deve ser da mais especifica para a mais generica
public class TesteRuntimeExceptions{
	
	public static void main(String[] args) {
		try{
			System.out.println("Inicio bloco try");
			System.out.println("Recuperando o primeiro parametro");	
			String parametro0 = args[0];
			System.out.println(parametro0);
			System.out.println("Convertendo o parametro");	
			int divisor = Integer.parseInt(parametro0);
			System.out.println("Dividindo pelo parametro");	
		 	int i = 1/divisor;
			Produto mochila = new Produto("Mochila Grande", 50.0);
			//mochila = null;
			mochila.getDescricao();
			System.out.println("Fim bloco try");
		//multi-catch (|) captura tanto ArrayIndexOutOfBoundsException ou NumberFormatException
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException ex){
			System.out.println("=catch=Passe um parâmetro numerico " +  ex.getMessage());
		}catch(ArithmeticException ex){
			System.out.println("=catch=Divisor diferente de zero");
		}catch(Exception ex){
			System.out.println("=catch=Erro");
		}finally{
			System.out.println("Bloco finally");
		}
		System.out.println("Fora do bloco try");	
	}

}
