package university;

public class Universidade {
	
	private String nome;
	private String Localizacao;
	
	
	public Universidade(String nome, String localizacao) {
		super();
		this.nome = nome;
		Localizacao = localizacao;
	}



	public String getLocalizacao() {
		return Localizacao;
	}



	public void setLocalizacao(String localizacao) {
		Localizacao = localizacao;
	}



	void seuNome() {
		
		System.out.println("Faculdade "+this.nome);
		
	}



	public String getNome() {
		return nome;
	}



	public Universidade(String nome) {
		super();
		this.nome = nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
}
