package questao6;

public class Conta {

	private double saldo;

	public void deposita(double dinheiro) {

		this.saldo=saldo+dinheiro;
		
	}
	
	
	

	public double getSaldo() {
		return saldo;
	}




	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}




	public void saca(double dinheiro) {
		if(dinheiro > saldo) {
		
			ContaExcecao e=new ContaExcecao("Saldo Insuficiente (saldo atual:"+ this.saldo +")" +"tente uma quantia menor");
			
		throw e;
		}
		System.out.println("Saldo atual:"+ this.saldo);
			
		this.saldo=saldo-dinheiro;
	}

}
