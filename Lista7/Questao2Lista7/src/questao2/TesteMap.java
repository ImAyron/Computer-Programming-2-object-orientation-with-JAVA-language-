package questao2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {
	public static void main(String[] args) {
		
		
		Map<String, String>map= new HashMap<String , String >();
		String nome=" Steve Jobs";
		String id="a1234";
		String nome1=" Scott McNealy";
		String id1="a1235";
		String nome2=" Jeff Bezos";
		String id2="a1236";
		String nome3=" Larry Ellison";
		String id3="a1237";
		map.put(id,nome);
		map.put(id1,nome1);
		map.put(id2,nome2);
		map.put(id3,nome3);
		
		Set<String> chavess= map.keySet();
		
		for(String chave: chavess) {
			
			System.out.println("ID:"+chave+" Nome:"+map.get(chave));
		}
		System.out.println(map.get("1234"));//retorna nulu pois o add não esta cadastrado
		
		
		Map<Integer, Funcionario>mapa= new HashMap<Integer , Funcionario >();
		Funcionario f1=new Funcionario(1,"Ayron","Engenheiro da computação",15000);
		Funcionario f2=new Funcionario(2,"Pedro","Engenheiro eletricista",15000);
		Funcionario f3=new Funcionario(3,"Gabriel","Engenheiro de produção",15000);
			
		mapa.put(f1.getId(), f1);
		mapa.put(f2.getId(), f2);
		mapa.put(f3.getId(), f3);
		Set<Integer> chaves= mapa.keySet();
			
		for(int chave : chaves) {
			
			System.out.println("ID:"+chave +"\nNome:"+mapa.get(chave).getNome()+"\nCargo:"+mapa.get(chave).getCargo()+"\nSalario:"+mapa.get(chave).getSalario());
			
		}
		
		
	}

	
	
		
	
}
