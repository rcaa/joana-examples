package teste04;

public class Teste04{

	public static int getSecret(){
		return 10;
	}

	public static int getOk(){
		return 5;
	}

	public static void main(String[] args){
		int secret = getSecret(); //source high
		int ok = getOk();
		System.out.println(ok); //sink low
	}

}