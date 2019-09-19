package exemplo4;

public class Classe1 extends Thread {

	private Compartilhada c;

	public Classe1(Compartilhada c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
//			if (c.getNumero() < 50) {
//				try {
//					wait();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			c.setNumero(c.getNumero() + 1);
			System.out.println("Thread 1 " + c.getNumero());
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
