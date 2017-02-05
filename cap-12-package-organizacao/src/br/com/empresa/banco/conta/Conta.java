package br.com.empresa.banco.conta;

public class Conta {
	private double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}
}
