package operadores;

public class OperadoresLogicos {


	public static void main(String[] args) {

		float nota = 8.5f;
		float frequencia = 74.0f;
		
		System.out.println (nota>=7 && frequencia >=75); // E
		System.out.println (nota>=7 || frequencia >=75); // OU
		System.out.println (! (nota >=7  && frequencia >=75)); // NEGACAO

	
	}

}
