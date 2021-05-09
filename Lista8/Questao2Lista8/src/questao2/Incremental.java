package questao2;

public class Incremental {
	private static Incremental instancia=null;
	
	public static Incremental GetInstancia() {
		if(instancia == null) {
			
			instancia = new Incremental();
			
		}
		return instancia;
		
	}
	
	
	private static int count=0;
	private int numero;
	private Incremental() {
		numero=++count;
		
	}
	public String toString() {
		return "Incremental "+numero;
	}
	
}
