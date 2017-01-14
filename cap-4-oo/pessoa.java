class Pessoa {
	int idade;
	String nome;

	void aniversario(int born) {
		idade += born;
	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}

}

class Programa1 {
	public static void main(String[] args) {
		Pessoa fulano;
		fulano = new Pessoa();

		fulano.nome = "Hugo";
		fulano.idade = 20;
		fulano.aniversario(1);
		fulano.mostra();
	}
}

class Porta {
	String aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;

	void abre() {
		this.aberta = "sim";
	}
	void fecha() {
		this.aberta = "nao";
	}
	void pinta(String s) {
		this.cor = s;
	}
	String estaAberta() {
		return (this.aberta == "sim") ? "aberta" : "fechada";
	}
	void status() {
		System.out.println("A porta esta " + estaAberta());
		System.out.println("A cor da porta e " + this.cor);
		System.out.println("O comprimento e" + this.dimensaoX + ", " + "a altura e " + this.dimensaoY + "e a largura e " + this.dimensaoZ + ".");
	}
}

class Programa2 {
	public static void main(String[] args) {
		Porta portinha;
		portinha = new Porta();

		portinha.aberta = "sim";
		portinha.cor = "Preta";
		portinha.dimensaoX = 1;
		portinha.dimensaoY = 2;
		portinha.dimensaoZ = 0;

		portinha.status();
	}
}





class Casa {
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();

	String cor;

	void pinta(String s) {
		cor = s;
	}

	int quantasPortasAbertas() {
		int portas = 0;

		portas += (this.porta1.aberta == "sim") ? 1 : 0;
		portas += (this.porta2.aberta == "sim") ? 1 : 0;
		portas += (this.porta3.aberta == "sim") ? 1 : 0;

		return portas;
	}

	void mostra() {
		System.out.println("A cor e " + this.cor + ".");
		System.out.println("A casa tem " + this.quantasPortasAbertas() + " portas abertas.");
	}
}

class Programa3 {
	public static void main(String[] args) {
		Casa minhaCasa;
		minhaCasa = new Casa();

		minhaCasa.porta1.aberta = "sim";
		minhaCasa.porta2.aberta = "sim";
		minhaCasa.porta3.aberta = "nao";

		minhaCasa.pinta("branco");

		minhaCasa.mostra();
	}
}