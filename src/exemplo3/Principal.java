package exemplo3;

public class Principal {
	public static void main(String[] args) {
		new Thread(new Processo("T1", 1)).start();
		new Thread(new Processo("T2", 10)).start();
	}
}
