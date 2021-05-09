package questao6;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory{

	@Override
	public Queijo CriarQueijo(String queijo) {

		if (queijo == null)
			return null;
		if (queijo.equalsIgnoreCase("Prato")) {
			return new Prato();
		} else if (queijo.equalsIgnoreCase("Mussarela")) {
			return new Mussarela();
		} else if (queijo.equalsIgnoreCase("Cheddar")) {
			return new Cheddar();
		}

		return null;

	}

	@Override
	public Presunto CriarPresunto(String presunto) {

		if (presunto == null)
			return null;
		if (presunto.equalsIgnoreCase("de frango")) {
			return new DeFrango();
		} else if (presunto.equalsIgnoreCase("de peru")) {
			return new DePeru();
		}
		return null;

	}

	@Override
	public Salada CriarSalada(String salada) {

		if (salada == null)
			return null;
		if (salada.equalsIgnoreCase("com verdura")) {
			return new ComVerdura();
		} else if (salada.equalsIgnoreCase("Sem verdura")) {
			return new SemVerudra();
		}
		return null;

	}

	@Override
	public Pao CriarPao(String pao) {

		if (pao == null)
			return null;
		if (pao.equalsIgnoreCase("Integral")) {
			return new Integral();
		} else if (pao.equalsIgnoreCase("Frances")) {
			return new Francês();
		} else if (pao.equalsIgnoreCase("Bola")) {
			return new Bola();
		}
		return null;

	}
	
	@Override
	public void nome() {
		System.out.println("LANCHONETE JP");
		
	}
	
}
