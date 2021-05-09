package pessoa;

import java.util.Scanner;

public class Pobre extends Pessoa {

	public Pobre(String nome, int idade) {
		super(nome, idade);
	}

	private double dinheiro;
	private int horasTrabalhadas;
	private double valorDaHora;

	public void trabalha() {
		Scanner x = new Scanner(System.in);
		System.out.println("Quantas horas trabalhadas:");
		this.horasTrabalhadas = x.nextInt();
		System.out.println("Valor da hora");
		this.valorDaHora = x.nextDouble();

		this.dinheiro = this.horasTrabalhadas * this.valorDaHora;

	}

	public double getDinheiro() {
		return dinheiro;
	}

}
