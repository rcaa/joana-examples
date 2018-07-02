package teste05;

public class InfFlow {
	
	public static void main(String[] args) {
		int secret = 0; //Source High
		int pub = 1;   //Source Low
		A o = new A();
		o.set(secret); //Passa o valor de secret para x
		o = new A();
		o.set(pub);   //Passa o valor de public para x
		System.out.println(o.get()); //Printa 1, ou seja, no information flow. Sink low
	}
	
	/*
	 * Esse exemplo mostra que o campo x dos dois objetos de A são distintos(object-sensitivity).
	 * Os efeitos de diferentes chamadas do set não são "mesclados"(context-sensitivity), e 
	 * flow-sensitivy encerra qualquer influência da variável secret com a chamada de println.
	 * Joana detecta violação!
	 */		
}
