package university;

public class Teste {
	public static void main(String[] args) {
		Departamento D1=new Departamento("Decea");
		Departamento D2=new Departamento("icea");
		Departamento D3=new Departamento("decom");
		Universidade Princeton=new Universidade("Princeton","(Nova Jersey - Estados Unidos da America)","Decom");
		Pessoa Einstein=new Pessoa("Einsten",Princeton,"14/3/1879","Fisica",D1);
		Universidade Cambridge=new Universidade("Cambridge","(Inglaterra)","icea");
		Pessoa Newton=new Pessoa("Newton",Cambridge,"4/1/1643","Matematica",D2);
		Universidade univale=new Universidade("Univale","(Canada)");
		
		//univale.setDepartamento(D3);
		//System.out.println(univale.getDepartamento().getNome());
		
		Princeton.addDepartamento(D1);
		Princeton.addDepartamento(D2);
		Princeton.addDepartamento(D3);
		univale.printDepartamento();
		univale.addDepartamento(D1);
		Princeton.printDepartamento();
		univale.printDepartamento();
		//System.out.println(Einstein.getDepartamento().getNome());
		//System.out.println(Princeton.getDepartamento().getNome());
		
	}

}
