package br.com.empresa.banco.TesteCollections;

import java.util.HashMap;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;

public class Banco extends Conta {

	@Override
	protected void deposita() {
		
	}

	@Override
	public void atualiza(double taxa) {
		
	}
	
	Map<String, Conta> contas = new HashMap<>();
	
	public void adiciona(Conta c) {
		this.contas.put(this.getNome(), c);
	}
	
	/*public Conta pega(String x) {
		return this.contas.get(x);
	}*/
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	public Conta buscaPorNome(String nome) {
		return this.contas.get(nome);
	}
}
