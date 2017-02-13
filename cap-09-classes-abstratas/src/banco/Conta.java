package banco;

public abstract class Conta {
	protected double saldo;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	abstract void deposita();
	
	void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public abstract void atualiza(double taxa);

	public void saca(double valor) {
		this.saldo -= valor;
	}
}
