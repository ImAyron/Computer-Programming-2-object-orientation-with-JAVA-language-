package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Scanner;
public class Nomes {
	Set<String> nomes = new HashSet<>();
	Scanner x = new Scanner(System.in);
	Scanner t = new Scanner(System.in);
	public void inserirNomes() {
		
		
		int k = 0;
		System.out.println("Digite a quantidade de nomes que queira inserir:");
		k = t.nextInt();
		for (int i = 0; i < k; i++) {

			System.out.println("Digite o nome:");
			String aux = x.nextLine();
			nomes.add(aux);
		}

	}

	public void imprimirNomes() {
		for (String i : nomes) {

			System.out.println(i);
		}
	}

	public void removerNome() {
		System.out.println("Digite o nome que queira remover:");
		String aux = x.nextLine();
		if (nomes.contains(aux)) {
			nomes.remove(aux);
		} else {
			System.out.println("Nome não encontrado");

		}

	}
	
	public void verificarNome() {
		System.out.println("Digite o nome que queira verificar se foi armazenado:");
		String auxa=x.nextLine();
		if(nomes.contains(auxa)) {
			System.out.println("Contém");
			
		}
		else {
			System.out.println("Não Contém");	
		}
		
		
	}
	public void limparNomes() {
		System.out.println("Limpando nomes:");
		nomes.clear();
		
	}

}
