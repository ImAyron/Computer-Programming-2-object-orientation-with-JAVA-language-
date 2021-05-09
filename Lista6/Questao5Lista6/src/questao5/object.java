package questao5;

import java.util.ArrayList;

public class object extends iAnimal implements Ferramentas {

	private iAnimal[] aux;

	public iAnimal[] getAux() {
		return aux;
	}

	public void setAux(iAnimal[] aux) {
		this.aux = aux;
	}

	@Override
	public ArrayList<String> filtraEspecie(iAnimal[] completo, String especieFiltrar) {

		ArrayList<String> auxa = new ArrayList<>();
		System.out.println("Animais da especie:"+especieFiltrar);
		for (int i = 0; i < completo.length; i++) {
			if (especieFiltrar.equals(this.aux[i].getNomeEspecie())) {
				auxa.add(this.aux[i].getNomeAnimal());

			}

		}

		return auxa;
	}

	@Override
	public String[] classificaEspecies(iAnimal[] completo) {
		// TODO Auto-generated method stub
		return null;
	}

}
