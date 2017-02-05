package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.ContaCorrente;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(ContaCorrente c) {
		System.out.println("Saldo anterior: " + c.getSaldo());

		c.atualiza(this.selic);

		System.out.println("Saldo atual: " + c.getSaldo() + "\n");

		this.saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}