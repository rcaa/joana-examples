package teste05;

public class Main {

	public static void main(String[] args) {
		int secret = 0;
		A o = new A();
		if(secret == 0) {
			o = new B();
		}
		o.set();
		System.out.println(o.get());
	}
	
	/*
	 * Linha 8 checa se o valor de secret é 0 e cria um objeto de tipo real B, caso seja. 
	 * A chamada de o.set() é dinâmica... pode ser chamado o set da classe A, ou o da classe B, a
	 * depender do fluxo de execução. Joana detecta uma violaçao.
	 */
}
