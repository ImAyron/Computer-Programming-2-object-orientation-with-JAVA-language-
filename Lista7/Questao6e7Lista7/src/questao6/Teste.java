package questao6;

public class Teste {

	
	public static void main(String[] args) {
		
		//tratamento de exceção questão 6
		Conta minhaConta =new Conta();
		try {
		minhaConta.deposita(100);
		minhaConta.saca(1000);
		}catch (ContaExcecao e){
			
			System.out.println("Saldo Insuficiente, tente uma quantia menor");
			
			
	}
		System.out.println(minhaConta.getSaldo());
		
		//questão 7 recuperando o saldo atual(implementado na classe Conta)
		
		Conta minhaConta1 =new Conta();
		minhaConta1.deposita(100);
		minhaConta1.saca(1000);
		
	}
	
}
