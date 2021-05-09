package ingresso;

public class Ingresso {

	private double valorReais;
	
	
	public Ingresso(double valorReais) {
		super();
		this.valorReais = valorReais;
	}


	public void imprimeValor() {
		
		
		System.out.println(this.valorReais);
		
	}


	public double getValorReais() {
		return valorReais;
	}


	public void setValorReais(double valorReais) {
		this.valorReais = valorReais;
	}
	
	
}
