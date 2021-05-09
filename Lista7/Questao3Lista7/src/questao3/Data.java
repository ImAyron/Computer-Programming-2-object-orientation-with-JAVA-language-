package questao3;

import java.util.Comparator;

public class Data implements Comparator<Empregados>{

	

	@Override
	public int compare(Empregados c1, Empregados c2) {
		// TODO Auto-generated method stub
		return c1.getData().compareTo(c2.getData());	
	}


}
