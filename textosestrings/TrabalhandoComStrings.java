package textosestrings;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		// metodos são da Classe Character
		
		//verificar se o valor é numero e retorna true ou false 
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('a'));
		
		System.out.println("====================================");
		
		//verifica se o valor é uma letra e retorna true ou false
		System.out.println(Character.isLetter('f'));
		System.out.println(Character.isLetter('6'));
		
		System.out.println("====================================");

		//verifica se o valor é uma letra ou numero e retorna true ou false
		System.out.println(Character.isLetterOrDigit('c'));
		System.out.println(Character.isLetterOrDigit('5'));
		System.out.println(Character.isLetterOrDigit('@'));
		
		System.out.println("====================================");
		
		//verifica se o valor está escrito com caracter maiusculo
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isUpperCase('A'));
		
		System.out.println("====================================");
		
		//verifica se o valor é um espaço em branco
		System.out.println(Character.isWhitespace(' '));
		
		System.out.println("====================================");
		//STRINGS
		
		
		//verifica valor antigo e substitui pelo valor novo
		String arquivo = "escola.java";
		arquivo = arquivo.replace("escola.java","java.class");
		System.out.println(arquivo);

		System.out.println("====================================");

		//compara 2 valores
		String nome1 = "flavia";
		String nome2= "Flavia";
		
		System.out.println("====================================");
		//compara conteudo e caracteres maiusculo/minusculo
		System.out.println(nome1.equals(nome2));
		
		System.out.println("====================================");
		// compara o conteudo do texto
		System.out.println(nome1.equalsIgnoreCase(nome2));
		
		System.out.println("====================================");
		// verfica se inicia com a mesma sequencia de caracterres
		System.out.println(nome1.startsWith("fla"));
		System.out.println(nome1.startsWith("Fla"));
		
		System.out.println("====================================");
		//verifica se finaliza com a mesma sequencia de caracteres
		System.out.println(nome1.endsWith ("ia"));
		System.out.println(nome1.endsWith ("fla"));
		
		System.out.println("====================================");
		//compara as letras uma a uma
		//muito usado para colocar em ordem alfabetica
		//collections
		System.out.println(nome1.compareTo(nome2));
		

		System.out.println("====================================");
		//verifica o tamanho da string
		System.out.println(nome1.length());
				
		System.out.println("====================================");
		//mostra o valor armazenado num determinado indice
		System.out.println(nome1.charAt(4));
				
		System.out.println("====================================");
		//retorna uma parte de uma string (informar inicio e fim)
		System.out.println(nome1.substring(2, 4));
		
		System.out.println("====================================");
		//retorna a posição da 1ª ocorrencia de uma letra
		System.out.println(nome1.indexOf("a"));
				
		System.out.println("====================================");
		//retorna a posição da ultima ocorrencia de uma letra
		System.out.println(nome1.lastIndexOf("a"));
		
		
		
	}
}