package br.com.empresa.banco.TestesJavaLang;

import java.io.PrintStream;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaString {
	public static void main(String[] args) {
		String s = " fj11 ";
		String s2 = s.replaceAll("1", "2");

		// System.out.println(s2.contains("22"));
		// System.out.println(s2 + "\n" + s2.trim());
		// System.out.println(s2.isEmpty());
		// System.out.println(s2.trim().length());

		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		// 3)
		// x1 == x2
		if (x1.equals(x2)) {
			// System.out.println("igual");
		} else {
			// System.out.println("diferente");
		}

		// 4)
		String str = "123"; // ("asd") ->NumberFormatException
		int numero = Integer.parseInt(str);
		System.out.println(numero);

		// 5)
		PrintStream saida = System.out;
		saida.println("olá");

		// 6), 7)
		//reescrever toString na Conta
		Conta conta = new ContaCorrente();
		System.out.println(conta + "  (exercício 6 e 7)");
		
		// 9) classe BigDecimal
	}
}
