package questao5;

public class FabricaFiat extends AbstractFactory{

	@Override
	public CarroSedan CriaCarroSedan(String carro) {
		if(carro==null)
			return null;
		if(carro.equalsIgnoreCase("Siena")) {
			return new Siena();
		}
		else if(carro.equalsIgnoreCase("Fiesta Sedan")) {
			return new FiestaSedan();
		}
		return null;
	}

	@Override
	public CarroPopular CriaCarroPopular(String carro) {
		// TODO Auto-generated method stub
		return null;
	}

}
