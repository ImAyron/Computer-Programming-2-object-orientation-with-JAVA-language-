package ingresso;

public class Normal extends Ingresso{
	
	
	
	public Normal(double valorReais) {
		super(valorReais);
		
	}

	public void imprime() {
		
		System.out.println("Ingresso Normal, preço:"+this.getValorReais());
		
	}
	

}
