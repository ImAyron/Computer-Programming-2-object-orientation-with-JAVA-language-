package questao5;

import java.util.ArrayList;

public interface Ferramentas {

	public ArrayList<String> filtraEspecie(iAnimal[] completo, String especieFiltrar);

	public String[] classificaEspecies(iAnimal[] completo);

}
