package blog;

import java.util.Calendar;


public class Postagem {
	
	private int id;
	private String titulo;
	private String texto;
	private Calendar dataPublicacao=Calendar.getInstance();
	private Usuario user;
	
	public Postagem(int id, String titulo, String texto, Usuario user) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.texto = texto;
		//this.dataPublicacao = dataPublicacao;
		this.user=user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Calendar getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Calendar dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}

	
	

}
