package questao3;

import java.util.Comparator;

public class OrdemAlfabetica implements Comparator<Empregados>{


	public int compare(Empregados c1, Empregados c2) {
		

		
		
	return c1.getNome().compareTo(c2.getNome());	
	}
	
    }


