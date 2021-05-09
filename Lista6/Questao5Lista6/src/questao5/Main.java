package questao5;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Teste> a = new ArrayList<>();
		Teste b = new Teste();
		b.setNomeAnimal("pedro");
		b.setNomeEspecie("gato");
		Teste t = new Teste();
		t.setNomeAnimal("adsa");
		t.setNomeEspecie("gato");
		Teste cb = new Teste();
		cb.setNomeAnimal("jose");
		cb.setNomeEspecie("MULA");
		a.add(b);
		a.add(cb);
		a.add(t);
		object d = new object();
		for (Teste i : a) {

			System.out.println("Nome:" + i.getNomeAnimal() + "\nEspecie:" + i.getNomeEspecie());

		}
		iAnimal x = new iAnimal();
		x.setNomeEspecie("mula");
		x.setNomeAnimal("pedro");
		iAnimal xa = new iAnimal();
		xa.setNomeEspecie("mula");
		xa.setNomeAnimal("adsa");
		iAnimal xaa = new iAnimal();
		xaa.setNomeEspecie("gato");
		xaa.setNomeAnimal("adasghdsga");
		iAnimal xaaa = new iAnimal();
		xaaa.setNomeEspecie("mula");
		xaaa.setNomeAnimal("adsa");
		iAnimal[] vetor = new iAnimal[4];
		vetor[0] = x;
		vetor[1] = xa;
		vetor[2] = xaa;
		vetor[3] = xaaa;
		ArrayList<String> as = new ArrayList<>();

		d.setAux(vetor);
		as = d.filtraEspecie(vetor, "mula");
		ArrayList<Resultado> vava = new ArrayList<>();
		vava = contar(a,d);
	
		System.out.println(vava.size());
		System.out.println(vava.get(0).getNomeEspecie());

		for (String i : as) {

			System.out.println(i);
		}

	}

	public static ArrayList<Resultado> contar(ArrayList<Teste> a, object b) {

		int cont = 0;
		ArrayList<Resultado> aux = new ArrayList<>();
		for (Teste i : a) {

			if (i.getNomeEspecie().equals(b.getNomeEspecie())) {

				cont++;

			}

		}

		Resultado auxa = new Resultado(b.getNomeEspecie(), cont);

		aux.add(auxa);

		return aux;
	}

}
