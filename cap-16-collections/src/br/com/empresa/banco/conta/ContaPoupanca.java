package br.com.empresa.banco.conta;

import br.com.empresa.banco.sistema.Tributavel;

public class ContaPoupanca extends Conta implements Tributavel, Comparable<ContaPoupanca> {
	public void atualiza(double taxa) {
		
	}

	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void deposita() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(ContaPoupanca outra) {
		/*if (this.getNumero() < outra.getNumero()) {
			return -1;
		}
		
		if (this.getNumero() > outra.getNumero()) {
			return 1;
		}
		
		return 0;*/
		
		//ou
		//return Integer.compare(this.getNumero(), outra.getNumero());
		
		return this.getNome().compareTo(outra.getNome());
	}
}
