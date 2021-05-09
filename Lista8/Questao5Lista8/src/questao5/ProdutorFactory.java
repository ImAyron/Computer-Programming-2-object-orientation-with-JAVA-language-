package questao5;

public class ProdutorFactory {

	public static AbstractFactory GetFactory(String fabrica) {
		if(fabrica.equalsIgnoreCase("Fabrica Fiat")) {
			return new FabricaFiat();
		}else if(fabrica.equalsIgnoreCase("Fabrica Ford")) {
			
			return new FabricaFord();
			
		}
		return null;
		
	}
	
}
