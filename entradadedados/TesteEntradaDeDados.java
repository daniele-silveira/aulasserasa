package entradadedados;

import java.util.Scanner;

public class TesteEntradaDeDados {

	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner (System.in); // instancia = copia 
		
		System.out.println("Infome o seu nome: ");
		String nome =  entradaDeDados.nextLine();
		System.out.println("Nome informado é: " + nome);

		System.out.println("Informe a sua idade: ");
		int idade = Integer.valueOf(entradaDeDados.nextLine());
		System.out.println("Idade informada: " + idade);
		
		//int idade = Integer.valueOf(entradaDeDados.nextLine()); Gambiarra para usar o nextLine 
		
		
		System.out.println("Digite o sexo: ");
		entradaDeDados.nextLine(); 
		String sexo = entradaDeDados.nextLine();
		System.out.println("Sexo informado: "+ sexo);
		
	

	
	
	}
	
	
}
