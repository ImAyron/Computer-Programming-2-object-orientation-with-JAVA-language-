package questao4;

public class PresuntoFactory {

	public static Presunto CriaPresunto(String presunto) {
		if(presunto==null)
		return null;
		if(presunto.equalsIgnoreCase("de frango")) {
			return new DeFrango();
		}else if(presunto.equalsIgnoreCase("de peru")) {
			return new DePeru();
		}
		return null;
	}
	
	
}
