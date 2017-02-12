package br.com.empresa.banco.conta;

import java.util.HashMap;
import java.util.Map;

public abstract class Conta {
	protected double saldo;
	protected int numero;
	private String nome;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	protected abstract void deposita();
	
	public void deposita(double valor) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	public void imprimeNome() {
		for (int i = 0; i < this.nome.length() - 1; i++) {
			System.out.println(this.nome.charAt(i));
		}
	}
	
	
}
