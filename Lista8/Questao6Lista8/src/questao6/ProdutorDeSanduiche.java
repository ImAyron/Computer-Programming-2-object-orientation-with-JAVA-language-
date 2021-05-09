package questao6;

public class ProdutorDeSanduiche {
	
	public static SanduichesIngredientFactory GetFactory(String fabrica) {
		
		if(fabrica.equalsIgnoreCase("CG")) {
			return new SanduichesIngredientFactoryCG();
		}
		else if(fabrica.equalsIgnoreCase("JP")) {
			return new SanduichesIngredientFactoryJP();
		}else if(fabrica.equalsIgnoreCase("RT")) {
			return new FabricaDeSanduichesRT();
		}
		
		return null;
	}

}
