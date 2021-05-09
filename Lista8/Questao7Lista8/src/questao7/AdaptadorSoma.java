package questao7;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorSoma implements SomadorEsperado {

	public static SomadorExistente somador=new SomadorExistente();


	@Override
	public int somaVetor(int[] vetor) {

		List<Integer> array =new ArrayList<Integer>();
		

		for (int i= 0 ; i<vetor.length;i++) {
			array.add(vetor[i]);
		}
		
		int resultado= somador.somalista(array);

		return resultado;
	}

}
