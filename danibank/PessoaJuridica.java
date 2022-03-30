package danibank;

public class PessoaJuridica extends PessoaHeranca{

	private String cnpj;
	private String segmento;
	private String responsavel;
	
	
	
	public String getCnpj() {
		return cnpj;
	}
	
	
	public PessoaJuridica(String cnpj, String segmento, String responsavel) { //gcfs
		super();
		this.cnpj = cnpj;
		this.segmento = segmento;
		this.responsavel = responsavel;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	
	
	
}
