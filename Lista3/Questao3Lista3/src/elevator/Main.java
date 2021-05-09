package elevator;

public class Main {
	
	
	public static void main(String[] args) {
		
		Elevador a=new Elevador();
		a.inicializa(5,4);
		a.entra();
		a.sai();
		a.sobe();
		a.sobe();
		a.desce();
		a.desce();
		System.out.println(a.getAndarAtual());
		
		
	}

}
