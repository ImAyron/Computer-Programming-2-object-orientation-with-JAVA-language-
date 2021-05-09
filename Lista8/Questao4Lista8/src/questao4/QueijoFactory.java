package questao4;

public class QueijoFactory {

	public static Queijo CriarQueijo(String queijo) {
		
		
		if(queijo==null)
			return null;
		if(queijo.equalsIgnoreCase("Prato")) {
			return new Prato();
		}else if(queijo.equalsIgnoreCase("Mussarela")) {
			return new Mussarela();
		}else if(queijo.equalsIgnoreCase("Cheddar")) {
			return new Cheddar();
		}
		
		return null;
	}
	
	
	
}
