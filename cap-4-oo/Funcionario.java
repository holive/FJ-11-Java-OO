class Funcionario {
	String nome;
	double salario;
	String dataEntraBanco;
	String rg;
	boolean estaNaEmpresa;
	Data dataDeEntrada;

	double recebeAumento(double valor) {
		return this.salario += valor;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}

	boolean demite() {
		return this.estaNaEmpresa = false;
	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data entrada no banco: " + this.dataEntraBanco);
		System.out.println("RG: " + this.rg);
		System.out.println("Esta na empresa: " + this.estaNaEmpresa);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
		System.out.println(this.dataDeEntrada.dataFormatada());
	}
}

class Data {
	int dia;
	int mes;
	int ano;

	String dataFormatada() {
		return dia + "/" + mes + "/" + ano;
	}
}

class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		f1.dataDeEntrada = data;

		f1.nome = "Hugo";
		f1.salario = 100;
		f1.recebeAumento(50);

		f1.mostra();
	}
}

class ComparaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();

		f1.nome = "Danilo";
		f2.nome = "Danilo";

		if (f1 == f2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
	}
}
