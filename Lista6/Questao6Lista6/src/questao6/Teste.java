package questao6;

public class Teste {
	
	public static void main(String[] args) {
		Bicicleta a=new Bicicleta();
		Automovel b=new Automovel();
		b.acelerar(100);
		b.acelerar(100);
		b.acelerar(50);
		b.parar();
		b.trocarOleo(10);
		b.trocarOleo(10);
		a.acelerar(10);
		a.acelerar(10);
		a.parar();
		System.out.println(a.getVelocidade());
	}

}
