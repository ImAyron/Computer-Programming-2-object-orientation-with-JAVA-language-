package questao6;

public class Automovel extends Veiculo {

	private float velocidade;
	private float oleo;
	
	@Override
	public float acelerar(float velocidade) {
		System.out.println("VELOCIMETRO:"+this.velocidade+"\nAcelerou:"+ velocidade);
		return this.velocidade=this.velocidade+velocidade;
	}

	@Override
	public void parar() {
		System.out.println("RRRRRRRRRRR parando");
		this.velocidade=0;
		
		
	}

	public void trocarOleo(float litros) {
		System.out.println("Trocando Oleo:");
		System.out.println("Oleo antes:"+this.oleo);
		this.oleo=this.oleo+litros;
		System.out.println("Oleo depois:"+this.oleo);
		
	}

	public float getVelocidade() {
		return velocidade;
	}


	
	
}
