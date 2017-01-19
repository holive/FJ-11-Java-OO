public class TestaAtualizadorDeContas {
	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		Banco banco = new Banco();
		banco.adiciona(c);
		banco.adiciona(cc);
		banco.adiciona(cp);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		int numeroDeContas = banco.pegaTotalDeContas();

		for (int i = 0; i < numeroDeContas; i++) {
			if (banco.pegaConta(i) != null) {
				adc.roda(banco.pegaConta(i));
			}
		}
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}
}

