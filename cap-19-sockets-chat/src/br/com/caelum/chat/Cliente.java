package br.com.caelum.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws UnknownHostException, IOException {
		new Cliente().executa();
	}
	
	public void executa() throws UnknownHostException, IOException {
		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out.println("O cliente se conectou ao servidor! \nDigite seu nick: ");
		
		//Recebe mensagens do servidor
		DistribuiMensagem recebe = new DistribuiMensagem(cliente);
		Thread t = new Thread(recebe);
		t.start();
				
		//Mensagem do teclado pro servidor
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		while (teclado.hasNextLine()) {
			saida.println(teclado.nextLine());
		}
		
		saida.close();
		teclado.close();
		cliente.close();
	}
}
