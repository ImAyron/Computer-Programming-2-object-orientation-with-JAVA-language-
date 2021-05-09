package questao1;

public class ClasseTesteSingleton {
	
	private static ClasseTesteSingleton instancia = null;
	
	private ClasseTesteSingleton() {
		
	}
	
	public static ClasseTesteSingleton GetInstancia() {
		
		if(instancia ==null) {
			instancia = new ClasseTesteSingleton();
		}
		return instancia;
		
	}
	
	public void testeMetodo() {
		System.out.println("CLASSE TESTE SYNGLETON");
	}
	

}
