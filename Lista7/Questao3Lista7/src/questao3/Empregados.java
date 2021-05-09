package questao3;

import java.util.Comparator;

public class Empregados implements Comparable<Empregados> {
	
	
	public Empregados(int id, String nome, double salario, String data) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.data = data;
	}
	
	
	
	private int id;
	private String nome;
	private double salario;
	private String data;
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public String getData() {
		return data;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public int compareTo(Empregados o) {
		if(this.salario<o.salario)
			return -1;
		
		if(this.salario>o.salario)
			return 1;
		
		return 0;
		
	}
	
	public void exibirDados() {
		
		
		System.out.println("Id:" + this.getId() + "\nNome:" + this.getNome() + "\nSalario:" + this.getSalario() + "\nData:"
				+ this.getData());
		
		
	}
	


}
