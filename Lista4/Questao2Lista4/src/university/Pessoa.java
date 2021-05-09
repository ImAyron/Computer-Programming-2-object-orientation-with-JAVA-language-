package university;


public class Pessoa{
	
	private String nome;
	private Universidade uni;
	private String dataDeNascimento;
	private String materia;
	private Departamento departamento;
	
	public Pessoa(String nome, Universidade uni, String dataDeNascimento, String materia,Departamento departamento) {
		super();
		this.nome = nome;
		this.uni = uni;
		this.dataDeNascimento = dataDeNascimento;
		this.materia = materia;
		this.departamento=departamento;
		
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}


	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Universidade getUni() {
		return uni;
	}

	public void setUni(Universidade uni) {
		this.uni = uni;
	}


	void imprime(Pessoa a) {
		
		System.out.println(this.nome+" trabalha na faculdade "+a.getUni().getNome()+" e nasceu em "+this.dataDeNascimento);
		
	}
	
	void relatorio() {
		
		
		System.out.println(this.nome + " trabalhou como professor de "+this.materia+ " em "+getUni().getNome()+getUni().getLocalizacao());
		
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
	
	
}