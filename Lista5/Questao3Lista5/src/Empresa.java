
public class Empresa {
	
	
	private String nome;
	private String endereco;	
	private	String cidade;
	private int cep;
	private int Telefone;
	public Empresa(String nome, String endereco, String cidade, int cep, int telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.cep = cep;
		Telefone = telefone;
	}
	public Empresa() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public int getCep() {
		return cep;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	@Override
	public String toString() {
		return "Nome=" + nome + ", Endereço=" + endereco + ", Cidade=" + cidade + ", Cep=" + cep
				+ ", Telefone=" + Telefone ;
	}
	
	

}
