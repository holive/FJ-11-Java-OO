class arrayFibonacci {
	public static void main(String[] args) {
		int[] numeros = new int[9];
		numeros[0] = 0;
		numeros[1] = 1;

		for (int i = 2; i < numeros.length - 1; i++) {
			numeros[i] = numeros[i - 1] + numeros[i - 2];

			System.out.println(numeros[i]);
		}
	}
}
