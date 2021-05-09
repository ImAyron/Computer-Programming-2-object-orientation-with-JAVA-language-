package pessoa;

public class Miseravel extends Pessoa{
	

	
	public Miseravel(String nome, int idade) {
		super(nome, idade);
	}


	private double dinheiro;
	
	
	public void esmola(double esmola) {
		
		
		
		this.dinheiro=this.dinheiro+esmola;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	
	

}
