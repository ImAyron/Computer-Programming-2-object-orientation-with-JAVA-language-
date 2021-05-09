package questao6;

public class SaladaFactory {
	
	public static Salada CriaSalada(String salada) {
		if(salada==null)
			return null;
		if(salada.equalsIgnoreCase("com verdura")) {
			return new ComVerdura();
		}else if(salada.equalsIgnoreCase("Sem verdura")) {
			return new SemVerudra();
		}
		return null;
	}

}
