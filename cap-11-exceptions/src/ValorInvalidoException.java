
public class ValorInvalidoException extends Exception {
	public ValorInvalidoException(double valor) {
		super("valor inv�lido: " + valor);
	}
}
