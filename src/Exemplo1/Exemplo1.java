package Exemplo1;

public class Exemplo1 {

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				int numero = 0;
				for (int i = 0; i < 10; i++) {
					numero += 1;
					System.out.println("T1 " + numero);
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				int numero = 0;
				for (int i = 0; i < 10; i++) {
					numero -= 1;
					System.out.println("T2 " + numero);
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}
