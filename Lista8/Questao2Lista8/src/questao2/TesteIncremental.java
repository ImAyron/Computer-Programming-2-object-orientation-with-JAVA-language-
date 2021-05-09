package questao2;

public class TesteIncremental {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Incremental inc=Incremental.GetInstancia();
			System.out.println(inc);
			
		}
	}
	
	
	
}
// Primeira execução imprimiu de 1 a 10 essas atraibuições de i++ so funcionava na classe construtor e na segundo somente 1 visto que so foi instanciada uma vez a classe 