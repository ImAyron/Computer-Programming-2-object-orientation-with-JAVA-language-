package questao6;

public interface SanduichesIngredientFactory {
	

	public abstract Queijo CriarQueijo(String queijo);
	public abstract Presunto CriarPresunto(String presunto);
	public abstract Salada CriarSalada(String salada);
	public abstract Pao CriarPao(String pao);
	public void nome();

}
