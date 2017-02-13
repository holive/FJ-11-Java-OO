class TestaEmpresa {
	public static void main(String[] args) {
		Funcionario fulano = new Funcionario();
		Funcionario fulano2 = new Funcionario("fulano2");
		fulano.setNome("eu");
		
		Empresa xpto = new Empresa(5);

		for (int i = 0; i < 3; i++) {
			Funcionario f = new Funcionario();
			f.setSalario(100 * i);

			xpto.adiciona(f, i, 29, 02, 2016);
		}

		System.out.println("\n" + xpto.getQuantidadeDeFuncionarios()  + "\n");
		System.out.println(xpto.getFuncionario(2) + ", data de entrada " + xpto.getFuncionario(2).getDataEntrada());
	}
}


class Data {
	public int dia;
	public int mes;
	public int ano;
	private boolean bisexto = false;
	private int maxDias;

	public void setAno(int ano) {
		this.ano = ano;
		for (int i = 1940; i < 2050; i += 4) {
			if (ano == i) {
				this.bisexto = true;
				break;
			}
		}
	}

	public void setMes(int mes) {
		if (mes <= 12) {
			this.mes = mes;
		} else {
			this.mes = 000;
		}

		//quantidade de dias
		if (this.mes == 2) {
			this.maxDias = 28;
		} else {
			if (this.mes % 2 == 0 && this.mes != 8) {
				this.maxDias = 30;
			} else {
				this.maxDias = 31;
			}
		}
	}

	public void setDia(int dia) {
		int diaPlus = (this.bisexto == true && this.mes == 2 ? 1 : 0);

		if (dia <= this.maxDias + diaPlus) {
			this.dia = dia;
		} else {
			this.dia = 000;
		}
	}

	public String dataFormatada() {
		if (this.dia < 1 || this.mes < 1 || this.ano < 1) {
			return "A data que voce digitou esta errada.";
		} else {
			return dia + "/" + mes + "/" + ano;
		}
	}
}

class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		f1.setNome("Hugo");
		f1.setSalario(100);
		f1.recebeAumento(50);

		f1.mostra();
	}
}

class ComparaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();

		f1.setNome("Danilo");
		f2.setNome("Fulano");

		if (f1 == f2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
	}
}

class Empresa {
	private String nome;
	private long cnpj;
	private Funcionario[] empregados;
	private Funcionario[] maisEmpregados = new Funcionario[20];

	Empresa(int quantidadeFuncionarios) {
		this.empregados = new Funcionario[quantidadeFuncionarios];
	}

	public Funcionario getFuncionario(int posicao) {
		return this.empregados[posicao];
	}

	public int getQuantidadeDeFuncionarios() {
		int quantidade = 0;
		for (int i = 0; i <= this.empregados.length - 1; i++) {
			if (this.empregados[i] != null) {
				quantidade += 1;
			}
		}
		return quantidade;
	}

	public void mostraEmpregados() {
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

	public void funcionarioNaEmpresa(String f) {
		for (int i =0; i < empregados.length; i++) {
			if (this.empregados[i].getNome() == f) {
				System.out.println("Funcionario existe na posicao " + i + "da array.");
			}
		}
	}

	public void adiciona(Funcionario f, int counter, int dia, int mes, int ano) {
		for (int i = 0; i < counter; i++) {
			if (counter < empregados.length) {
				for (int b = 0; b < empregados.length; b++) {
					if (this.empregados[b] == null) {
						this.empregados[b] = f;
						f.getData().setDia(dia);
						f.getData().setMes(mes);
						f.getData().setAno(ano);
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

	public void copiaArray(Funcionario f, int i) {
		if (i == empregados.length) {
			for (int b = 0; b < empregados.length; b++) maisEmpregados[b] = empregados[b];
		}
		
		if (this.maisEmpregados[i] == null) {
			this.maisEmpregados[i] = f;
		}
	}
}

class Funcionario {
	private String nome;
	private double salario;
	private String dataEntraBanco;
	private String rg;
	private boolean estaNaEmpresa;
	private Data dataDeEntrada = new Data();
	private static int identificador;

	public Data getData() {
		return this.dataDeEntrada;
	}

	public static int getIdentificador() {
		return Funcionario.identificador;
	}

	public Funcionario() {
		Funcionario.identificador += 1;
	}

	public Funcionario(String nome) {
		this.nome = nome;
		Funcionario.identificador += 1;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	double recebeAumento(double valor) {
		return this.salario += valor;
	}

	double getGanhoAnual() {
		return this.salario * 12;
	}

	boolean demite() {
		return this.estaNaEmpresa = false;
	}

	public String getDataEntrada() {
		return this.dataDeEntrada.dataFormatada();
	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data entrada no banco: " + this.dataEntraBanco);
		System.out.println("RG: " + this.rg);
		System.out.println("Esta na empresa: " + this.estaNaEmpresa);
		System.out.println("Ganho anual: " + this.getGanhoAnual());
		System.out.println(this.dataDeEntrada.dataFormatada());
	}
}

class PessoaFisica {
	private String cpf;

	public void validaCpf(String cpf) {
		this.cpf = cpf;
	}
}
