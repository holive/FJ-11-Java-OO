
public class Programa implements Runnable {
	private int id;
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Programa " + id + " valor: " + i);
		}
		
	}

	public void setId(int i) {
		this.id = i;
	}

}
