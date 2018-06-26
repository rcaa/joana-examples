package teste02;

public class Teste02{
	
	Integer l;
	Integer h;

	public static int inputPIN(){
		return 42;
	}

	public void thread1(){
		l = 45;
		h = inputPIN(); //source high
	}
	
	public void thread2(){
		System.out.println(l); //sink low
		//l = h;
	}

	public static void main(String [] args){
		Teste02 t = new Teste02();
		t.thread1();
		t.thread2();
	}
}

//Quando põe os atributos como Integer, ou seja, inteiros sem ser do tipo primitivo int, uma violação
//é detectada.