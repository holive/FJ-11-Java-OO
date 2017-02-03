package banco;

public class Principal {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.deposita(100.0);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.1);
		adc.roda(conta);
	}	
}
