package questao1;

public class Teste {
	public static void main(String[] args) {
		ClasseTesteSingleton c1 = ClasseTesteSingleton.GetInstancia();
		System.out.println("ELEMENTO 1="+c1);
		
		ClasseTesteSingleton c2 = ClasseTesteSingleton.GetInstancia();
		System.out.println("ELEMENTO 2="+c2);
		ClasseTesteSingleton c3 = ClasseTesteSingleton.GetInstancia();
		System.out.println("ELEMENTO 1="+c3);
		
		//Todos possuem a mesma referência para a classe  ClasseTesteSingleton
	}
}
