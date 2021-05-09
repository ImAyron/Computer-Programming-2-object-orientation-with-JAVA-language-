package university;
import java.util.ArrayList; 

public class Universidade {
	
	private String nome;
	private String Localizacao;
	private Departamento departamento;
	ArrayList<Departamento> depart=new ArrayList();
	
	public Universidade(String nome, String localizacao, String nomed) {
		super();
		this.nome = nome;
		this.Localizacao = localizacao;
		this.departamento=new Departamento(nomed);
		
	}
	
	public Universidade(String nome, String localizacao) {
		super();
		this.nome = nome;
		this.Localizacao = localizacao;
		
	}

	void addDepartamento(Departamento a) {
		if(depart.size()<50) {
		depart.add(a);
		}
		else {
			System.out.println("Limite de departamento");
		}
		
		
	}
	
	void retiraDepartamento(Departamento a) {
		
		depart.remove(a);
		
	}	
	
	void printDepartamento() {
		System.out.println("Departamentos da faculdade "+ this.nome);
		if(depart.size()==0) {
			System.out.println("Não há nenhum departamento");
		}
		for(Departamento p : depart) {
			
			System.out.println(p.getNome());
			
			
		}
		
	}


	public Departamento getDepartamento() {
		return departamento;
	}



	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	public String getLocalizacao() {
		return Localizacao;
	}



	public void setLocalizacao(String localizacao) {
		Localizacao = localizacao;
	}



	void seuNome() {
		
		System.out.println("Faculdade "+this.nome);
		
	}



	public String getNome() {
		return nome;
	}



	public Universidade(String nome) {
		super();
		this.nome = nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
}
