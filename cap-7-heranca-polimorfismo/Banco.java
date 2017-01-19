public class Banco {
	Conta[] conta = new Conta[10];
	private int totalDeContas;

	public void adiciona(Conta c) {
		for (int i = 0; i < this.conta.length; i++) {
			if (this.conta[i] == null) {
				this.conta[i] = c;
				break;
			}
		}
	}

	public Conta pegaConta(int x) {
		return this.conta[x];
	}

	public int pegaTotalDeContas() {
		for (int i = 0; i < this.conta.length; i++) {
			if (this.conta[i] != null) {
				this.totalDeContas += 1;
			}
		}
		return totalDeContas;
	}
}