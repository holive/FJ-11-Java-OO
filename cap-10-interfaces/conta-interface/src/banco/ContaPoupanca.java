package banco;

public class ContaPoupanca implements Conta{
	private double saldo;
	
	@Override
	public double getSaldo() {
		return saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		this.saldo = getSaldo() - valor;
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += taxaSelic * 0.1;
	}

}
