package blog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


public class Blog {

	
	private ArrayList<Postagem> postagens =new ArrayList<>();
	private ArrayList<Postagem> postagensPublicadas =new ArrayList<>();
	
	Calendar c=Calendar.getInstance();
	
	
	void adicionarPostagem(Postagem p) {
		String login;
		String senha;
		Scanner x=new Scanner(System.in);
		System.out.println("Para adicionar uma Postagem voçe deve estar logado:");
		System.out.print("login:");
		login=x.nextLine();
		System.out.print("senha:");
		senha=x.nextLine();
		
		if(p.getUser().getLogin().equals(login)) {
			if(p.getUser().getSenha().equals(senha))
			postagens.add(p);
		}
		else {
			System.out.println("Login ou senha incorreta");
		}
		
		
		
	}
	void apagarPostagem(Postagem p) {
		
		postagensPublicadas.remove(p);
		postagens.remove(p);
	}
	
	void publicarPostagem(Postagem p) {
		
		
		if(postagens.contains(p))
			
		postagensPublicadas.add(p);
		
		
	}
	
	void listarPostagensPublicadas() {
		if(postagens.size()>0)
	System.out.println("POSTAGENS PUBLICADAS");
		for(Postagem p : postagensPublicadas) {
			//if(p.getDataPublicacao().get< c.getFirstDayOfWeek())
			System.out.println("Id:"+p.getId()+"\nTitulo:"+p.getTitulo()+"\nTexto:"+p.getTexto()+"\n"+p.getDataPublicacao().getTime()+"\nPublicado por "+p.getUser().getNome());
			System.out.println("\n-------------------------------------------------------------------------------------");
		}
		
	}
	
	
	void listarTodasAsPostagens() {
		if(postagens.size()>0)
		System.out.println("TODAS AS POSTAGENS");
for(Postagem p : postagens) {
			
			System.out.println("Id:"+p.getId()+"\nTitulo:"+p.getTitulo()+"\nTexto:"+p.getTexto()+"\n"+p.getDataPublicacao().getTime()+"\nPublicado por "+p.getUser().getNome());
			System.out.println("\n-------------------------------------------------------------------------------------");
		}
		
	}
		
		
	
	
	
}
