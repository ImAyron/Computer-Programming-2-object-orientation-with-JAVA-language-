package animais;

public class Texte {

	
	public static void main(String[] args) {
		
		
		Cachorro bidu=new Cachorro();
		
		bidu.setNome("bidu");
		System.out.println(bidu.late());
		System.out.println(bidu.caminha());
		Gato zezinho=new Gato();
		zezinho.setNome("zezinho");
		System.out.println(zezinho.mia());
		System.out.println(zezinho.caminha());
		
		
		
	}
	
	
}
