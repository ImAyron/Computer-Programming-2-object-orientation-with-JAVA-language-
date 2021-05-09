package ingresso;

public class Vip extends Ingresso{
	
	private double valorAdicional;
	
	
	
	
	public Vip(double valorReais, double valorAdicional) {
		super(valorReais);
		this.valorAdicional = valorAdicional;
	}


	public double valorIngresso() {
		
		
	this.setValorReais(getValorReais()+this.valorAdicional);
		
	
	return this.getValorReais();
	}


	public double getValorAdicional() {
		return valorAdicional;
	}


	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	

}
