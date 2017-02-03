
class TestaDeposita {
	public static void main(String[] args) {
		Conta c = new Conta();
		
		try {
			c.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
