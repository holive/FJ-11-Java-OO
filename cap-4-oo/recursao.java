class recursao {
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();

		for (int i = 1; i <= 6; i++) {
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.println(resultado);
		}
	}
}

class Fibonacci {
	int calculaFibonacci(int posicao) {
		int um = 0;
		int dois = 0;
		int soma = 1;

		if (posicao == 1) {
			return 1;
		} else {
			for (int i = 1; i <= posicao - 1; i++) {
				um = dois;
				dois = soma;
				soma = um + dois;
			}
		}
		
		return soma;
	}
}
