package midia;

import java.util.Scanner;

public class CD extends Midia implements TOCA{

	
	private int nMusicas;
	
	
	public CD(int codigo, double preco, String nome,int nMusicas) {
		super(codigo,preco,nome);
		this.nMusicas = nMusicas;
	}

	public CD() {
		super();
	}

	@Override
	public String getDetalhes() {
		// TODO Auto-generated method stub
		System.out.println("TOCANDO A PRIMEIRA M�SICA DO CD\n");
		return super.getDetalhes()+"\nN�mero de m�sicas:"+ this.nMusicas;
	}

	@Override
	public void printDados() {
		// TODO Auto-generated method stub
		super.printDados();
		
		
	}
	@Override
	public String getTipo() {
		
		return "CD";
	}
	
	@Override
	public void inserirDados() {
		// TODO Auto-generated method stub
		super.inserirDados();
		System.out.println("\nDigite o n�mero de m�sicas:");
		Scanner t = new Scanner (System.in);
		this.nMusicas=t.nextInt();
		
	}

	public int getnMusicas() {
		return nMusicas;
	}

	public void setnMusicas(int nMusicas) {
		this.nMusicas = nMusicas;
	}
	public void setMusica(int m) {
		if(this.nMusicas>=m)
		System.out.println("Mudou para a m�sica:"+m);
		else
			System.out.println("N�O EXISTE ESSE NUMERO DE FAIXA");
		
	}
	
}
