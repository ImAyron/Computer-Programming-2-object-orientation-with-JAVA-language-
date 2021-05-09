package questao6;

public class Bicicleta extends Veiculo{
	private float velocidade;
	@Override
	public float acelerar(float velocidade) {
		System.out.println("VELOCIMETRO:"+this.velocidade+"\nAcelerou:"+ velocidade);
		return  this.velocidade=this.velocidade+velocidade;
	}

	@Override
	public void parar() {
			System.out.println("RRRRRRRRRRR parando");
			this.velocidade=0;
			
	}
	
	public float getVelocidade() {
		return velocidade;
	}



}
