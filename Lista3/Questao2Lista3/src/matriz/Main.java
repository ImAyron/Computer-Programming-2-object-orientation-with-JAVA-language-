package matriz;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		Matriz a=new Matriz(2,3);
		a.numLinhas();
		a.numColunas();
		a.preencheMatriz();
		a.imprimeMatriz();
		a.alterarPosicao();
		a.imprimeMatriz();
		a.transposta();

		a.imprimeMatriz();
		
	}

}
