package banco;

public class ContaCorrente implements Tributavel{
	private double saldo;

	public void atualiza(double taxa) {
		this.saldo += taxa * 0.1;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
