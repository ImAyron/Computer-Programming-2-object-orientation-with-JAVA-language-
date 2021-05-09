package temperatura;

public class AdaptadorCelsius implements MedidorCelsiusIF{

	public static MedidorFarenheit medidor=new MedidorFarenheit();
	
	
	@Override
	public double medirTemperatura() {
		
		return (medidor.getTemperaturaFarenheit()-32)/1.8;
	}

}
