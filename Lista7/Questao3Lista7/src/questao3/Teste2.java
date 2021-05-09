package questao3;

import java.util.ArrayList;
import java.util.Collections;

public class Teste2 {
	public static void main(String[] args) {
		Empregados f1 = new Empregados(12, "hjyron", 4001111, "25/11/2000");
		Empregados f2 = new Empregados(12, "byron", 500, "26/11/2000");
		Empregados f3 = new Empregados(12, "dyron", 10000, "22/03/2000");
		Empregados f4 = new Empregados(12, "cyron", 10, "21/02/2000");
			
		ArrayList<Empregados> arra = new ArrayList<>();

		arra.add(f1);
		arra.add(f2);
		arra.add(f3);
		arra.add(f4);

		for (Empregados a : arra) {

			System.out.println("Id:" + a.getId() + "\nNome:" + a.getNome() + "\nSalario:" + a.getSalario() + "\nData:"
					+ a.getData());

		}

		Collections.sort(arra);
		System.out.println("\nORDEM DE SALARIO\n");
		for (Empregados a : arra) {

			System.out.println("Id:" + a.getId() + "\nNome:" + a.getNome() + "\nSalario:" + a.getSalario() + "\nData:"
					+ a.getData());

		}

		Collections.sort(arra, new OrdemAlfabetica());

		System.out.println("\nORDEM ALFABETICA\n");
		for (Empregados a : arra) {

			System.out.println("Id:" + a.getId() + "\nNome:" + a.getNome() + "\nSalario:" + a.getSalario() + "\nData:"
					+ a.getData());

		}

		
		//Teste salario sem Ajuda da classe Collections
		ArrayList<Double> c = new ArrayList<>();
		for (Empregados a : arra) {

			c.add(a.getSalario());

		}
		String maio = null, meno = null;
		for (Empregados a : arra) {

			c.add(a.getSalario());

		}
		double x = Collections.min(c);
		double t = Collections.max(c);

		for (Empregados a : arra) {

			if (a.getSalario() == x) {

				meno = a.getNome();

			}
			if (a.getSalario() == t) {

				maio = a.getNome();

			}
			

		}

		System.out.println("\nMenor salário é do :"+meno +" Valor:"+x +"\nMaior salário é do :"+maio +" Valor:"+t);
		
		
		
		//Teste data 
		Data a1=new Data();
		Empregados a2=Collections.max(arra,a1);
		Empregados a3=Collections.min(arra,a1);
		System.out.println("\nMais experiente");
		a2.exibirDados();
		System.out.println("\nMenos experiente");
		a3.exibirDados();
	}

}
