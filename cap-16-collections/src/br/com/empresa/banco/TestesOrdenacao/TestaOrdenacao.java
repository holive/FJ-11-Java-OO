package br.com.empresa.banco.TestesOrdenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.*;

public class TestaOrdenacao {
	public static void main(String[] args) {
		List<ContaPoupanca> contas = new LinkedList<>();
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1973);
		c1.setNome("asd");
		contas.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(1462);
		c2.setNome("aasdgsd");
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(1854);
		c3.setNome("fghfgjasd");
		contas.add(c3);
		
		
		
		for (int i = 0; i < 3; i++) {
			ContaPoupanca cp = new ContaPoupanca();
			
			Random numero = new Random();
			int aleatorio = numero.nextInt(55555);
			
			cp.setNome("fghfgjasd" + i);
			cp.setNumero(aleatorio);
			contas.add(cp);
		}
		
		Collections.sort(contas);
		
		for (int i = 0; i < contas.size(); i++) {
			System.out.println("nome da conta: " + contas.get(i).getNome());
		}
	}
}