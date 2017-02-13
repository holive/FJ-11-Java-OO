public class TestaHeranca {
	
	public static void main(String[] args) {
		Conta programador = new Conta();
		ContaCorrente programadorCC = new ContaCorrente();
		ContaPoupanca programadorCP = new ContaPoupanca();
		
		programador.deposita(5000);
		programadorCC.deposita(5000);
		programadorCP.deposita(5000);
		
		programador.atualiza(0.01);
		programadorCC.atualiza(0.01);
		programadorCP.atualiza(0.01);
		
		System.out.printf("Saldo da Conta Corrente: %.2f\n",programadorCC.getSaldo());
		System.out.printf("Saldo da Poupança:  %.2f\n", programadorCP.getSaldo());
	}
}


