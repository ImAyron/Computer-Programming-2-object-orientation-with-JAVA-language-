package questao6;

public class Main {
public static void main(String[] args) {
	
	SanduichesIngredientFactory f1=ProdutorDeSanduiche.GetFactory("CG");
	f1.nome();
	Pao pao=f1.CriarPao("Integral");
	pao.imprimir();
	Presunto presunto=f1.CriarPresunto("de frango");
	presunto.imprimir();
	Queijo queijo=f1.CriarQueijo("Prato");
	queijo.imprimir();
	Salada salada=f1.CriarSalada("sem verdura");
	salada.imprimir();
	
	
	
	
	
	
	
	
	
}
}
