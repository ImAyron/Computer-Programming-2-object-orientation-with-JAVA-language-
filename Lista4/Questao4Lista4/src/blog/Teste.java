package blog;

import java.util.Calendar;


public class Teste {
	public static void main(String[] args) {
		
		Blog facebook=new Blog();
		Usuario Ayron =new Usuario(1,"Ayron","Ayron","1234");
		Postagem p1=new Postagem(1,"PROGRAMAÇÃO DE COMPUTADORES","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer"
				+ " \ntook a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,"
				+ " \nbut also the leap into electronic typesetting, remaining essentially unchanged. It was popularised "
				+ "\nin the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop"
				+ " \npublishing software like Aldus PageMaker including versions of Lorem Ipsum.",Ayron);
		
		Usuario Ayron1 =new Usuario(21,"LUIGI","Rafael","12");
		Postagem p2=new Postagem(2,"Lorem ipsun","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer"
				+ " \ntook a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,"
				+ " \nbut also the leap into electronic typesetting, remaining essentially unchanged. It was popularised "
				+ "\nin the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop"
				+ " \npublishing software like Aldus PageMaker including versions of Lorem Ipsum.",Ayron1);
		p1.getDataPublicacao().set(2010, 0, 26, 13, 20,10);
		facebook.adicionarPostagem(p1);
		facebook.adicionarPostagem(p2);
		facebook.publicarPostagem(p1);
		//facebook.publicarPostagem(p2);
		//facebook.apagarPostagem(p1);
		facebook.listarTodasAsPostagens();
		facebook.listarPostagensPublicadas();
	}

}
