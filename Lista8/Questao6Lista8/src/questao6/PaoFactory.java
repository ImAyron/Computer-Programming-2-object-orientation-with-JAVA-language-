package questao6;

public class PaoFactory {
	
	
	public static Pao CriarPao(String pao) {
		
		if(pao==null)
			return null;
		if(pao.equalsIgnoreCase("Integral")) {
			return new Integral();
		}else if(pao.equalsIgnoreCase("Frances")) {
			return new Franc�s();
		}else if(pao.equalsIgnoreCase("Bola")) {
			return new Bola();
		}
		return null;
		
	}

}
