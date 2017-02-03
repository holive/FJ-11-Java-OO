package banco;

public class ContaCorrente implements ContaTributavel {
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
	
	public void saca(double valor) {
		this.saldo = getSaldo() - valor;
	}

	@Override
	public double calculaTributos() {
		return 0;
	}
	
}
