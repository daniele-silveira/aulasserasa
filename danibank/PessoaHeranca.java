package danibank;

public class PessoaHeranca {
	
	private String nome;
	private String email;
	private String telefone;
	
	public PessoaHeranca () {
		//metodo construtor default = preenchimento dos atributos é opcional
		//metodo construtor padrão não tem valor de carga entre os parenteses
	}
	
	
	
	public PessoaHeranca(String nome,  String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() { // get exibe os objetos
		return nome;
	}
	public void setNome(String nome) { // set grava os objetos nos atributos
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

	
	
	
	
}