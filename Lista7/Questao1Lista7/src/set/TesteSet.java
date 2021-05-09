package set;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteSet {
	public static void main(String[] args) {
		Set<ProdutosSupermecado> prod=new HashSet<>();
		
		Nomes a=new Nomes();
		
		a.inserirNomes();
		a.imprimirNomes();
		a.removerNome();
		a.imprimirNomes();
		a.verificarNome();
		a.limparNomes();
		ProdutosSupermecado p1=new ProdutosSupermecado();
		ProdutosSupermecado p3=new ProdutosSupermecado();
		ProdutosSupermecado p2=new ProdutosSupermecado();
		
		p1.preencherDados();
		p2.preencherDados();
		p3.preencherDados();
		prod.add(p1);
		prod.add(p2);
		prod.add(p3);
		
		for(ProdutosSupermecado  c: prod) {
			
			c.imprimirDados();
			
			
		}
	
		
	}

}
