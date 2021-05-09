package midia;

import java.util.Scanner;

public class Midia implements TOCA {

	private int codigo;
	private double preco;
	private String nome;

	public Midia() {
		super();
	}

	public Midia(int codigo, double preco, String nome) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}

	public String getTipo() {

		return "Midia";
	}

	public String getDetalhes() {
		System.out.println("MOSTRANDO A CAPA\n");
		return "Código:" + this.codigo + "\nPreço:" + this.preco + "\nNome:" + this.nome;

	}

	public void printDados() {
		System.out.println("---------------------------------------------");
		System.out.println(this.getTipo()+"\n"+this.getDetalhes());
		

	}

	public void inserirDados() {

		Scanner x = new Scanner(System.in);
		System.out.println("Nome:");
		String a = x.nextLine();
		System.out.println("Codigo:");
		int ba = x.nextInt();
		System.out.println("preço:");
		double ca = x.nextDouble();
		this.nome = a;
		this.codigo = ba;
		this.preco = ca;

	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public String getNome() {
		return nome;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
