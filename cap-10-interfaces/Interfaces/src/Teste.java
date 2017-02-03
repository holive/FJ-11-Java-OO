class Teste {
	public static void main(String[] args) {
		AreaCalculavel a = new Quadrado(3);
		System.out.println(a.calculaArea());
		
		AreaCalculavel c = new Circulo(1.5);
		System.out.println(c.calculaArea());
	}
}