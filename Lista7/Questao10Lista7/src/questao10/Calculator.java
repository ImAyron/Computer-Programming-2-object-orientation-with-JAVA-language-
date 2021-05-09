package questao10;

public class Calculator {

	
	public static double div(double n1,double n2) {
		if(n2 == 0) {
		InvalidOperationException e=new InvalidOperationException("Divisão por Zero");
		
		throw e;}
		return n1/n2;
		
			
	
		
	}
	
	public static double log10(double logaritmando) throws Exception{
		
		
		return Math.pow(10, logaritmando);
		
	}
	

	
}
