package br.com.empresa.banco.TestesJavaLang;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaGuardador {
	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		ContaCorrente cc = new ContaCorrente();
		guardador.adicionaObjeto(123);
		
		//ContaPoupanca cp = (ContaPoupanca) guardador.pega(0);
	}
}
