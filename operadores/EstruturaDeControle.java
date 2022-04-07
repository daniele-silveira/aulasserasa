package operadores;

public class EstruturaDeControle {


public static void main(String[] args) {
		
		double salario = 1000.33;
	    //imprimir acima da media caso o salario seja maior que 2500

	    //IF
	    if (salario >= 2500)
	        System.out.println("Acima da media");
	    
	    //IF-ELSE
	    if (salario >= 2500)
	        System.out.println("Acima da media");
	    else 
	      System.out.println("Abaixo da media");
	    
	    //IF-ELSE-IF
	    if (salario >= 2500)
	        System.out.println("Acima da media");
	    else if(salario < 1000)
	        System.out.println("Muito abaixo da media");
	    else 
	          System.out.println("Na media");   
	    
	    // Forma Ternaria
	    String resposta = (salario >= 2500) ? "Acima da media": "Abaixo da média";
	    		System.out.println (resposta);
	    
// atributo = condicao do if ? valor verdadero: valor falso 

}
}
