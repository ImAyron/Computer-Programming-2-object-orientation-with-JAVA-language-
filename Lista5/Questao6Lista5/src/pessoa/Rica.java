package pessoa;

public class Rica extends Pessoa {

	private double dinheiro;

	public Rica(String nome, int idade, double dinheiro) {
		super(nome, idade);
		this.dinheiro = dinheiro;
	}

	public void fazCompras(double gastou) {

		this.dinheiro = this.dinheiro - gastou;

	}

	public double getDinheiro() {
		return dinheiro;
	}

}
