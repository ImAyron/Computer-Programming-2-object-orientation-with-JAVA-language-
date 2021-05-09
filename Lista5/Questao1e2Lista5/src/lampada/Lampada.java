package lampada;

public class Lampada {

	private int luminosidade;
	private String estadoAtual = "Apagada";
	private boolean estado = false;
	private int numWatts;
	

	public static int contadorAcesa = 0;
	public static int contadorLampadas = 0;

	public Lampada() {

		this.numWatts = 60;
		Lampada.contadorLampadas++;
		
	}

	public Lampada(int numWatts) {
		super();

		this.numWatts = numWatts;
		Lampada.contadorLampadas++;
	}

	public void estadoLampada() {

		if (luminosidade == 0) {
			this.estadoAtual = "Apagada";
			// System.out.println("Apagada");
		}
		if (luminosidade > 0) {
			this.estadoAtual = "Acesa";
			// System.out.println("Acessa");
		}

	}

	public void acender(int luminosidade) {
		Lampada.contadorAcesa++;
		this.luminosidade = luminosidade;
		this.estado = true;

	}

	public void apagar() {
		Lampada.contadorAcesa++;
		this.estado = false;

	}

	void imprimeEstado(Lampada a) {
		String aux = null;
		if (a.eEconomica() == true) {
			aux = "sim";
		} else {
			aux = "Não";
		}
		a.estadoLampada();
		System.out.println("A lampada esta " + a.estadoAtual + " com sua luminosidade em " + a.getLuminosidade() + "% "
				+ "\n Watts:" + a.getNumWatts() + " é econômica ?" + aux);

	}

	public int getLuminosidade() {
		return luminosidade;
	}

	public String getEstadoAtual() {
		return estadoAtual;
	}

	public boolean isEstado() {
		return estado;
	}

	public int getNumWatts() {
		return numWatts;
	}

	public static int getContadorAcesa() {
		return contadorAcesa;
	}

	public void setLuminosidade(int luminosidade) {
		if (luminosidade > 0 && this.estado!=true) {
			Lampada.contadorAcesa++;
		}
		this.luminosidade = luminosidade;
	}

	public void setEstadoAtual(String estadoAtual) {

		this.estadoAtual = estadoAtual;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void setNumWatts(int numWatts) {
		this.numWatts = numWatts;
	}

	public boolean estaLigada() {

		if (this.estadoAtual == "Acesa") {
			return true;
		}

		return false;

	}

	public boolean eEconomica() {

		if (this.numWatts < 40) {
			return true;
		}

		return false;
	}

}
