package lampada;

public class Teste {
	public static void main(String[] args) {

		Lampada a = new Lampada();
		Lampada b = new Lampada(39);
		LampadaFluorescente c = new LampadaFluorescente(39, 19);
		c.imprimeEstado(c);
		c.acender(30);
		c.imprimeEstado(c);
		System.out.println("NUMERO DE LAMPADAS CRIADAS " + a.contadorLampadas);
		a.imprimeEstado(b);
		a.imprimeEstado(a);
		System.out.println(a.estaLigada());
		a.setLuminosidade(50);
		a.imprimeEstado(a);
		System.out.println(a.estaLigada());
		System.out.println(a.getContadorAcesa());
		a.setLuminosidade(0);
		a.imprimeEstado(a);
		System.out.println(a.estaLigada());
		System.out.println(a.getContadorAcesa());
		a.acender(10);
		System.out.println(a.getContadorAcesa());
		a.setLuminosidade(10);
		System.out.println(a.getContadorAcesa());
		a.imprimeEstado(a);
	}

}
