
public class Restaurante extends Empresa {
	
	
	
	
	private String tipoDeComida;
	private double precoMedio;
	
	
	
	
	public Restaurante(String nome, String endereco, String cidade, int cep, int telefone, String tipoDeComida,
			double precoMedio) {
		super(nome, endereco, cidade, cep, telefone);
		this.tipoDeComida = tipoDeComida;
		this.precoMedio = precoMedio;
	}




	@Override
	public String toString() {
		return "Restaurante [Tipo de Comida=" + tipoDeComida + ", Preço médio=" + precoMedio +  ", " + super.toString() 
				+  "]";
	}
	
	
	
	

}
