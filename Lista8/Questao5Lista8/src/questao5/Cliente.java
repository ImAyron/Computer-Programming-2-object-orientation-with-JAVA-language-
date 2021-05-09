package questao5;

public class Cliente {
	
	
	public static void main(String[] args) {
		
		AbstractFactory f1=ProdutorFactory.GetFactory("Fabrica Ford");
		CarroPopular f2=f1.CriaCarroPopular("Palio");
		f2.exibirInfoPopular();
		
		CarroPopular f3=f1.CriaCarroPopular("Fiesta");
		f3.exibirInfoPopular();
		
		AbstractFactory f6=ProdutorFactory.GetFactory("Fabrica Fiat");
		CarroSedan f4=f6.CriaCarroSedan("Siena");
		f4.exibirInforSedan();
		
		CarroSedan f14=f6.CriaCarroSedan("Fiesta Sedan");
		f14.exibirInforSedan();
		
	}

}
