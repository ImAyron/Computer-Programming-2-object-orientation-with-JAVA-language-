package ingresso;

public class CamaroteSuperior extends Vip{
	
	private double valorAdicional2;
	
	
	
	



	public CamaroteSuperior(double valorReais, double valorAdicional, double valorAdicional2) {
		super(valorReais, valorAdicional);
		this.valorAdicional2 = valorAdicional2;
	}







	public double valorIngressoA() {
		
		
		
		return this.valorIngresso()+this.valorAdicional2;
		}

	
	
}
