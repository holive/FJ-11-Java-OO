
public class Anonima {
	public static void main(String[] args) {
		final int[] id = new int[1];
		id[0] = 1;
		
		Runnable r = () -> {
			for(int i = 0; i < 10000; i++)
				System.out.println("programa 1, id:" + id[0] + ", valor " + i);
		};
		
		Thread t = new Thread(r);
		t.start();
	}
}
