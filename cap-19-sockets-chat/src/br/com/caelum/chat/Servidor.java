package br.com.caelum.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {
	
	public static void main(String[] args) throws IOException {
		new Servidor().executa();
	}
	
	static List<PrintStream> lista = new ArrayList<>();
	
	public void executa() throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		int i = 0;
		while (true) {
			Socket cliente = servidor.accept();
			lista.add(new PrintStream(cliente.getOutputStream()));
			
			System.out.println("Nova conexão com o cliente " + ": " +
					cliente.getInetAddress().getHostAddress() + "\n");
			mostraClientes();
			
			ThreadCliente tratamento = new ThreadCliente(cliente, this, i);
			Thread t = new Thread(tratamento);
			t.start();
			
			i++;
		}
	}
	
	public void distribuiMensagem(String msg) {
		for (PrintStream cliente : lista) {
			cliente.println(msg);
		}
	}
	
	public static void mostraClientes() {
		System.out.println("Clientes conectados: ");
		for (PrintStream cliente : lista) {
			System.out.println(cliente);
		}
	}
}
