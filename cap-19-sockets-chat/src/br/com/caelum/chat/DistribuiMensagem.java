package br.com.caelum.chat;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class DistribuiMensagem implements Runnable {
	private Socket cliente = null;
	Scanner servidor = null;
	
	public DistribuiMensagem(Socket cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public void run() {
		try {
			servidor = new Scanner(cliente.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (servidor.hasNextLine()) {
			System.out.println(servidor.nextLine());
		}
	}
	
}
