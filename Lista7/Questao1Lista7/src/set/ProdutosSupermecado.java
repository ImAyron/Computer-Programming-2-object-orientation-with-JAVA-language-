package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProdutosSupermecado {
	
	
	private int codigoBarras;
	private String nome;
	private double preco;

	


	public void preencherDados() {
		
		Scanner x=new Scanner(System.in);
		Scanner a=new Scanner(System.in);
		Scanner b=new Scanner(System.in);
		
		System.out.println("Digite o codigo de barras:");
		this.codigoBarras=x.nextInt();
		
		System.out.println("Digite o nome do produto:");
		this.nome=a.nextLine();
		
		System.out.println("Digite o preço :");
		this.preco=b.nextDouble();
		
	
	}
	
	
	public void imprimirDados() {
		
		
		System.out.println("Nome:"+this.nome+"\nCodigo de Barras:"+this.codigoBarras+"\nPreço:"+this.preco);
		
		
	}
		
		
	

	public int getCodigoBarras() {
		return codigoBarras;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoBarras;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutosSupermecado other = (ProdutosSupermecado) obj;
		if (codigoBarras != other.codigoBarras) {
			return false;}
		System.out.println("Produto ja inserido.");
		return true;
	}
	
	
	
	

}
