package elevator;

public class Elevador {

	private int andarAtual = 0;
	private int totalAndar;
	private int capacidade;
	private int numeroPessoas = 0;

	public void inicializa(int capacidade, int totalAndar) {
		this.capacidade = capacidade;
		this.totalAndar = totalAndar;
	}

	public void entra() {

		if (this.numeroPessoas < this.capacidade) {

			this.numeroPessoas = this.numeroPessoas + 1;

		}

	}

	public void sai() {

		if (this.numeroPessoas!=0) {

			this.numeroPessoas = this.numeroPessoas - 1;

		}

	}

	public void sobe() {

		if (this.andarAtual < this.totalAndar) {

			this.andarAtual = andarAtual + 1;

		}

	}

	public void desce() {

		if (this.andarAtual != 0) {

			this.andarAtual = andarAtual - 1;

		}

	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndar() {
		return totalAndar;
	}

	public void setTotalAndar(int totalAndar) {
		this.totalAndar = totalAndar;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getNumeroPessoas() {
		return numeroPessoas;
	}

	public void setNumeroPessoas(int numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}

}
