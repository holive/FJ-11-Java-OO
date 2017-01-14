class Casa {
	String cor;
	int totalDePortas;
	Porta[] portas = new Porta[9];

	void pinta(String s) {
		this.cor = s;
	}

	void adicionaPorta(Porta p) {
		for (int i = 0; i < portas.length - 1; i++) {
			if (this.portas[i] == null) {
				p = new Porta();
				this.portas[i] = p;
				break;
			}
		}
	}

	int totalDePortas() {
		int portas = 0;
		for (int i = 0; i < this.portas.length; i++) {
			if (this.portas[i] != null) {
				portas += 1;
			}
		}
		return portas;
	}

	void quantasPortasEstaoAbertas() {
		int portasCadastradas = totalDePortas();
		int portasAbertas = 0;
		for (int i = 0; i <= portasCadastradas - 1; i++) {
			if (this.portas[i].portaAberta == true) {
				portasAbertas += 1;
			}
		}
		System.out.println(portasAbertas + " portas estao abertas.");
	}
}

class Porta {
	String nomeDaPorta = "Porta do quarto";
	boolean portaAberta = true;
}

class Programa {
	public static void main(String[] args) {
		Casa casa = new Casa();

		casa.pinta("Amarela");

		for (int i = 0; i < 3; i++) {
			Porta porta = new Porta();
			casa.adicionaPorta(porta);
		}

		casa.portas[0].portaAberta = false;

		casa.quantasPortasEstaoAbertas();

		System.out.println("Existem " + casa.totalDePortas() + " portas na minha casa.");
		System.out.println("A cor da casa e " + casa.cor);
	}
}