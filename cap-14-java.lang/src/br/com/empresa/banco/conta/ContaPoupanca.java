package br.com.empresa.banco.conta;

import br.com.empresa.banco.sistema.Tributavel;

public class ContaPoupanca extends Conta implements Tributavel {
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
}
