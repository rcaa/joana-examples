package teste03;

public class Teste03{

	public static int inputPIN(){
		return 42;
	}
	
	public int teste(A a, A b){
		int c = a.i + 42;
		return c;
	}

	public static void set(A v1, A v2, int h){
		v1.i = h;
	}

	public void metodoTeste(){
		A v1 = new A();
		A v2 = new A();
		int h = inputPIN(); 	//source high
		set(v1, v2, h);
		System.out.println(v2.i); //sink low, OK
		v2 = v1;
		set(v1, v2, h);
		System.out.println(v2.i); //sink low, BAD

	}

	public static void main(String [] args){
		Teste03 t = new Teste03();
		t.metodoTeste();
	}

}

//Duas violações são detectadas.

