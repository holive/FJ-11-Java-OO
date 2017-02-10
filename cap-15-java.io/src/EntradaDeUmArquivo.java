import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EntradaDeUmArquivo {
	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
		
		System.out.println("Digite sua mensagem:");
		
		//while (entrada.hasNextLine()) {
		//	System.out.println(entrada.nextLine());
		//}
		
		//write
		OutputStream os = new FileOutputStream("novoArquivo.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter write = new BufferedWriter(osw);
		
		while (entrada.hasNextLine()) {
			write.write(entrada.nextLine());
			write.newLine();
		}
		write.close();
	}
}