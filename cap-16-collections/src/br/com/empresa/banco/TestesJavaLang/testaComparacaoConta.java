package br.com.empresa.banco.TestesJavaLang;

import java.util.Arrays;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;

public class testaComparacaoConta {
	public static void main(String[] args) {
		Conta conta1 = new ContaCorrente();
		Conta conta2 = new ContaPoupanca();
		
		conta1.setNumero(1234);
		conta1.setNome("fulano");
		
		conta2.setNumero(1234);
		conta2.setNome("fulano");
		
		//System.out.println(conta1.equals(conta2));
		
		//conta1.imprimeNome();
		
		String frase = "Socorram-me, subi no ônibus em Marrocos";
		String array[] = frase.split("");
		StringBuilder fraseContrario = new StringBuilder();
		
		for (int i = array.length - 1; i >= 0; i--) {
			fraseContrario.append(array[i]);
		}
		
		System.out.println(fraseContrario);
		
		// 14)
		String string = "123";
		int numero =  Integer.valueOf(string);
		System.out.println(numero);
		
	}
}
