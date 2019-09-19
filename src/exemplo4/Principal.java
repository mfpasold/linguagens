package exemplo4;

public class Principal {

	public static void main(String[] args) {
		Compartilhada c =  new Compartilhada();
		Classe1 c1 = new Classe1(c);
		Classe2 c2 = new Classe2(c);
		
		c1.start();
		c2.start();
	}
}
