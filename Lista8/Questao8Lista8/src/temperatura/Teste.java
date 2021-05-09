package temperatura;
public class Teste {
public static void main(String[] args) {
	
	
	AdaptadorCelsius a=new AdaptadorCelsius();
	MedidorFarenheit b=new MedidorFarenheit();
	System.out.println(b.getTemperaturaFarenheit());
	System.out.println(a.medirTemperatura());
	
}
}
