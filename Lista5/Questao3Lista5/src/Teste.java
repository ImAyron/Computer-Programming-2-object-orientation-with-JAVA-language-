
public class Teste {
	
	
	public static void main(String[] args) {
		Empresa a=new Empresa();
		System.out.println(a.toString());
		Empresa b =new Empresa("Dona nana","Avenida Castelo Branco","jao monlevade",3097804,40028922);
		System.out.println(b.toString());
		a.setCep(1234);
		Restaurante c=new Restaurante("Dona nana","Avenida Castelo Branco","jao monlevade",3097804,40028922,"mexicana",15.90);
		System.out.println(c.toString());
		
	}
	
	
	

}
