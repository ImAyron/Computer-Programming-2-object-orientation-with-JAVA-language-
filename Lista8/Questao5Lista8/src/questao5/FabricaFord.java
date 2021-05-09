package questao5;

public class FabricaFord extends AbstractFactory{

	@Override
	public CarroSedan CriaCarroSedan(String carro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarroPopular CriaCarroPopular(String carro) {
		
		if(carro==null)
			return null;
		if(carro.equalsIgnoreCase("Palio")) {
			return new Palio();
		}else if(carro.equalsIgnoreCase("Fiesta")) {
			return new Fiesta();
		}
		
		
		return null;
	}

}
