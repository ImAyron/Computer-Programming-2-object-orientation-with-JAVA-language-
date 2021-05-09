package questao5;

public abstract class AbstractFactory {

	public abstract CarroSedan CriaCarroSedan(String carro);
	
	public abstract CarroPopular CriaCarroPopular(String carro);
}
