package questao3;

public class TesteForma {

	private FormaGeometrica forma;
	
	public TesteForma(String forma) {
		
		this.forma=FormaFactory.CriarForma(forma);
		
	}
	
	public FormaGeometrica GetFormaGeometrica() {
		
		return this.forma;
	}
	
	
}
