package br.com.caelum.chat;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ThreadCliente implements Runnable {
	public Socket cliente = null;
	Scanner entrada = null;
	Servidor servidor;
	String nick = null;
	int id = 0;
	
	public ThreadCliente(Socket cliente, Servidor servidor, int id) throws IOException {
		this.cliente = cliente;
		this.servidor = servidor;
		this.id = id;
	}
	
	@Override
	public void run() {
		try {
			entrada = new Scanner(cliente.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (entrada.hasNextLine()) {
			nick = entrada.nextLine();
		}
		
		while (entrada.hasNextLine()) {
			servidor.distribuiMensagem(nick + " diz:");
			servidor.distribuiMensagem(entrada.nextLine());
		}
		
		Servidor.lista.remove(id);
		System.out.print(cliente + " desconectou. \n");
		Servidor.mostraClientes();
		
	}

}
