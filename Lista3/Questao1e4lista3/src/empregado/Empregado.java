package empregado;

public class Empregado {
	
	
	private String nome;
	private double salario;
	private int horastrab = 8;
	
	public static int contadorDeEmpregados=0;
	
	public Empregado(String nome, double salario) {
		super();
		Empregado.contadorDeEmpregados++;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public void printInfor() {
		
		
		System.out.println("Nome:"+this.nome+"\nSalário:"+this.salario+"\nHoras trabalhadas:"+this.horastrab);
		
	}
	
	public void promocao(int percentual) {
		

		double salarioN=this.salario+((this.salario/100)*percentual);
		this.salario=salarioN;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getHorastrab() {
		return horastrab;
	}


	public void setHorastrab(int horastrab) {
		this.horastrab = horastrab;
	}
	
	public void gratificacao(double gratificacao) {
		
		if(this.horastrab>6) {
			
			
		this.salario=this.salario+gratificacao;
			
		}
		
	}
	public static int getNumeroDeEmpregadosCriados() {
		
		
		return contadorDeEmpregados;
	}
	
}
