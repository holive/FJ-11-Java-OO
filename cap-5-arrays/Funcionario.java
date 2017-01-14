class Funcionario {
	String nome;
	double salario;
	String dataEntraBanco;
	String rg;
	boolean estaNaEmpresa;
	Data dataDeEntrada = new Data();

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

class Empresa {
	String nome;
	long cnpj;
	int quantidadeDeFuncionarios = 5;
	Funcionario[] empregados = new Funcionario[quantidadeDeFuncionarios];
	Funcionario[] maisEmpregados = new Funcionario[10];

	void mostraEmpregados() {
		if (maisEmpregados[0] != null) {
			for (Funcionario x : maisEmpregados) {
				if (x != null) {
					x.mostra();
					System.out.println("\n");
				}
			}
		} else {
			for (Funcionario x : empregados) {
				if (x != null) {
					x.mostra();
					System.out.println("\n");
				}
			}
		}
		
	}

	void funcionarioNaEmpresa(String f) {
		for (int i =0; i < empregados.length; i++) {
			if (this.empregados[i].nome == f) {
				System.out.println("Funcionario existe na posicao " + i + "da array.");
			}
		}
	}

	void adiciona(Funcionario f, int counter) {
		for (int i = 0; i < this.maisEmpregados.length; i++) {
			if (counter < empregados.length) {
				for (int b = 0; b < empregados.length; b++) {
					if (this.empregados[b] == null) {
						this.empregados[b] = f;
						break;
					}
				}
			} else {
				for (int b = empregados.length; b < maisEmpregados.length; b++) {
					if (this.maisEmpregados[b] == null) {
						this.copiaArray(f, counter);
						break;
					}
				}
			}
		}
	}

	void copiaArray(Funcionario f, int i) {
		if (i == empregados.length) {
			for (int b = 0; b < empregados.length; b++) maisEmpregados[b] = empregados[b];
		}
		
		if (this.maisEmpregados[i] == null) {
			this.maisEmpregados[i] = f;
		}
	}
}

class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();

		for (int i = 0; i < 7; i++) {
			Funcionario f = new Funcionario();
			f.salario = 100 * i;

			empresa.adiciona(f, i);
		}

		empresa.mostraEmpregados();

	}
}

