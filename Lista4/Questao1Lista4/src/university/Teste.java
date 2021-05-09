package university;

public class Teste {
	public static void main(String[] args) {
		Universidade Princeton=new Universidade("Princeton","(Nova Jersey - Estados Unidos da America)");
		Pessoa Einstein=new Pessoa("Einsten",Princeton,"14/3/1879","Fisica");
		Universidade Cambridge=new Universidade("Cambridge","(Inglaterra)");
		Pessoa Newton=new Pessoa("Newton",Cambridge,"4/1/1643","Matematica");
		
		Cambridge.seuNome();
		Newton.imprime(Newton);
		Newton.relatorio();
		
		
		Princeton.seuNome();
		Einstein.imprime(Einstein);
		Einstein.relatorio();
		
	}

}
