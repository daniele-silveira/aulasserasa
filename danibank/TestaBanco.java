package danibank;

public class TestaBanco {
	
	public static void main(String[] args) {
//
//		Pessoa pessoaNumero1 = new Pessoa();  //criar uma instancia = copia
//		pessoaNumero1.nome = "Jose das Couves";
//		pessoaNumero1.profissao = "Agricultor";
//		pessoaNumero1.cpf = "643.829.641-48";
//		
//		
//		System.out.println("Nome: "+pessoaNumero1.nome);
//		System.out.println("Profissão: "+pessoaNumero1.profissao);
//		System.out.println("CPF: "+pessoaNumero1.cpf);
//		
//		
//	}
	
//		Pessoa pessoaNova = new Pessoa(); //(instanciar a classe Pessoa)
//		pessoaNova.setNome("Jose das Couves");
//		System.out.println ("Nome: " + pessoaNova.getNome());
//		
//		Pessoa pessoaComConstrutor1 = new Pessoa ("Joao dos Tomates", "259.800.966-55", "123.456-78");
//		
//		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
//		System.out.println("CPF: " + pessoaComConstrutor1.getRg());
//		System.out.println("RG: " + pessoaComConstrutor1.getCpf());
//		
//		
//	}
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
	//	conta1.setSaldo(1000000.50);  >>>>>>> Não se deve alterar diretamente essa informação. Ela apenas deve ser exibida
		conta1.setTitular ("Daniele Silveira");
		
		
		
		
		conta1.depositar (1900000.0);
		
				
		System.out.println("Agencia: " +conta1.getAgencia());
		System.out.println("Conta: " +conta1.getNumeroConta());
		System.out.println("Titular: " + conta1.getTitular());
		System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());

		
		if (conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso");
		
		}else {
			System.out.println("Verifique o valor de saque");
		}
		
		System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());
		
		Conta conta2 = new Conta();
			conta2.setAgencia(5582);
			conta2.setNumeroConta(2234);
			
			conta1.transferir(10000.0,conta2);
			
			System.out.printf("Saldo Atual Daniele: R$ %.2f \n",conta1.getSaldo());
			System.out.printf("Saldo Atual Babakuxy: R$ %.2f \n",conta2.getSaldo());

			
			
			
		
		
		
		
	}
	}
	

