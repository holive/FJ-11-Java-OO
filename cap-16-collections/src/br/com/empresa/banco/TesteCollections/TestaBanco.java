package br.com.empresa.banco.TesteCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.empresa.banco.conta.Conta;

class TestaBanco {
	public static void main(String[] args) {
		Conta conta1 = new Banco();
		Conta conta2 = new Banco();
		
		conta1.setNumero(123);
		conta2.setNumero(123);
		
		Set<Conta> contas = new HashSet<>();
		
		contas.add(conta1);
		contas.add(conta2);
		
		//System.out.println(contas);
		//exercício 16.16
		
		TreeSet<Integer> conjunto = new TreeSet<>();
		
		for (int i = 1; i <= 10; i++) {
			conjunto.add(i);
		}
		
		/*Iterator x = conjunto.descendingIterator();
		while (x.hasNext()) {
			System.out.println(x.next());
		}*/
		
		//exercício 16.17
		List<Integer> array = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			array.add(i);
		}
		
		for (int i = array.size() - 1; i >= 0; i--) {
			System.out.println(array.get(i));
		}
	}
}
