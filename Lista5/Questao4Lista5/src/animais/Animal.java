package animais;

public class Animal {
	
	private String nome;
	private String raça;
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
	public String getRaça() {
		return raça;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	public String caminha() {
		
		
		return this.nome+" está caminhando"; 
		
	}
	

}
