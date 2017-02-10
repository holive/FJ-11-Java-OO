import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaEntrada {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(
									new FileInputStream("arquivo.txt")));

	System.out.println("Digite sua mensagem: ");
	
 	String linha = null;
	try {
		linha = br.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

 	while (linha != null) {
 		System.out.println(linha);
 		linha = br.readLine();
 	}
 	br.close();
 }
}