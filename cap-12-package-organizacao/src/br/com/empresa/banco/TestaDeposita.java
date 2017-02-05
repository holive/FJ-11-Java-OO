package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ValorInvalidoException;

class TestaDeposita {
	public static void main(String[] args) {
		Conta c = new Conta();
		
		try {
			c.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
