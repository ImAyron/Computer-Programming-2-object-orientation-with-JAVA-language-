package midia;

import java.util.Scanner;

public class DVD extends Midia implements TOCA{
	
	
	private int nFaixas;

	
	
	public DVD(int codigo, double preco, String nome,int nFaixas) {
		super(codigo,preco,nome);
		this.nFaixas = nFaixas;
	}

	public DVD() {
		super();
	}

	public int getnFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}
	
	
	@Override
	public String getTipo() {
		
		return "DVD";
	}
	@Override
	public String getDetalhes() {
		// TODO Auto-generated method stub
		return super.getDetalhes()+ "\nNumero de faixas:"+this.nFaixas;
	}
	
	
	
	
	@Override
	public void printDados() {
		// TODO Auto-generated method stub
		super.printDados();
		System.out.println("--------------------------------------------------");
		
	}

	@Override
	public void inserirDados() {
		// TODO Auto-generated method stub
		super.inserirDados();
		System.out.println("\nDigite o número de faixas:");
		Scanner t = new Scanner (System.in);
		this.nFaixas=t.nextInt();
		
	}
	
	public void setFaixa(int f) {
		if(this.nFaixas>=f)
		System.out.println("Mudou para a faixa:"+f);
		else
			System.out.println("NÃO EXISTE ESSE NUMERO DE FAIXA");
	}

}
