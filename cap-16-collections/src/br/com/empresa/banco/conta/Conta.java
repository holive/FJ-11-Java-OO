package br.com.empresa.banco.conta;

public abstract class Conta {
	protected double saldo;
	protected int numero;
	private String nome;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	abstract void deposita();
	
	void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public abstract void atualiza(double taxa);

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public String toString() {
		return	"esse objeto é uma conta com saldo de R$" + this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;

		return this.numero == outraConta.numero && this.nome == outraConta.nome;
	}
	
	public void imprimeNome() {
		for (int i = 0; i < this.nome.length() - 1; i++) {
			System.out.println(this.nome.charAt(i));
		}
	}
}
