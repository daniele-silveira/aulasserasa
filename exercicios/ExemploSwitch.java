package exercicios;

public class ExemploSwitch {


	public static void main(String[] args) {
		String nome = "Antonio";
		
		switch (nome) {
		case "Antonio":
			System.out.println ("Excelente!");
			break;
			
		case "Maria":
			System.out.println ("Bom Trabalho");
			break;
			
		case "José":
		System.out.println ("Pode Melhorar");
		break;
		
		default:
		System.out.print ("Desculpe, você falhou");
		}
	}

}
