package exemplo2;

public class Classe2 extends Thread{

	public void run() {
		int numero = 0;
		for (int i = 0; i < 100; i++) {
			numero -= 1;
			System.out.println("Classe 2: " + numero);
		}
	}

}
