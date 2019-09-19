package exemplo3;

public class Processo implements Runnable{

	private String nome;
	private int valor;
	
	public Processo(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			valor += 1;
			System.out.println(nome + " " + valor);
		}
	}

}
