package debugs;

public class Calculadora {

	
	// variaveis declaradas aqui são globais
	
	public void soma(double valor1, double valor2) {
		//var resultado = valor1 + valor2; // para ser declarado de forma local
		var resultado = valor1 + valor2;
		System.out.println("Total:" + resultado);
	}


	public double subtracao(double valor1, double valor2) {
		return valor1 + valor2;
	
}

	// metodo estatico pertence ao metodo
	public static void multiplicacao (double valor1, double valor2) {
		System.out.println("Resultado: " + valor1*valor2);
}




}
