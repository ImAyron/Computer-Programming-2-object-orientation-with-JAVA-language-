package questao5;

public class Teste implements Animal{

	private String NomeEspecie;
	private String NomeAnimal;
	
	@Override
	public String getNomeEspecie() {
		// TODO Auto-generated method stub
		
		return this.NomeEspecie;
	}

	@Override
	public String getNomeAnimal() {
		// TODO Auto-generated method stub
		return this.NomeAnimal;
	}

	public void setNomeEspecie(String nomeEspecie) {
		NomeEspecie = nomeEspecie;
	}

	public void setNomeAnimal(String nomeAnimal) {
		NomeAnimal = nomeAnimal;
	}

}
