package animais;

public class Animal {
	
	private String nome;
	private String ra�a;
	public Animal(String nome) {
		super();
		this.nome = nome;
	}
	
	
	public Animal() {
		super();
	}


	public String getNome() {
		return nome;
	}
	public String getRa�a() {
		return ra�a;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	
	public String caminha() {
		
		
		return this.nome+" est� caminhando"; 
		
	}
	

}
