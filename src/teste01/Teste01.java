package teste01;

public class Teste01{

	public static int inputPIN(){
		return 42;
	}
	
	int f(int x){
		return x+42;
	}
	
	public void metodoTeste(){
		int secretField = inputPIN();  //source high
		int l = 2;                
		int secret = f(secretField);      
		int y = f(l);
		System.out.println(y);    //sink low //OK
	}

	public static void main(String [] args){
		Teste01 t = new Teste01();
		t.metodoTeste();
	}	
}

// Uma viola��o � detectada. Caso a linha 16 seja comentada, n�o detecta mais.






