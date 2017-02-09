package br.com.empresa.banco.TestesJavaLang;


public class GuardadorDeObjetos {
	private Object[] objetos = new Object[10];
	
	public void adicionaObjeto(Object cc) {
		this.objetos[0] = cc;
	}

	public Object pega(int i) {
		return this.objetos[i];
	}

}
