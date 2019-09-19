package exemplo4;

public class Classe2 extends Thread {

	private Compartilhada c;

	public Classe2(Compartilhada c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
//			if (c.getNumero() > 10) {
//				try {
//					wait();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			c.setNumero(c.getNumero() - 1);
			System.out.println("Thread 2 " + c.getNumero());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			notify();

		}
	}

}
