package br.com.caelum.chat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscreverArquivo {
	public EscreverArquivo(Scanner entrada) throws IOException {
		File novoArquivo = new File("recebido.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(novoArquivo))) {
			
		while (entrada.hasNextLine()) {
			bw.write(entrada.nextLine());
			bw.write("\n");
		}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		entrada.close();
		
		/*while (entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}*/
	}
}
