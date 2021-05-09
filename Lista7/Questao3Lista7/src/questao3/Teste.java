package questao3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Teste  {
public static void main(String[] args) {

	
	
	ArrayList<Integer> inteiros=new ArrayList<>();
	Random random = new Random();
	for(int i=0;i<50;i++) {
		
	int numero = random.nextInt(99);
	inteiros.add(numero);
	}
	
	for(int i=0;i<50;i++) {
		
		System.out.println("Numero "+ (i+1) +":" +inteiros.get(i));
		
	}
	
	System.out.println("Menor numero:"+Collections.min(inteiros));
	System.out.println("Maior numero:"+Collections.max(inteiros));
	System.out.println("Aparições menor numero:"+Collections.frequency(inteiros, Collections.min(inteiros)));
	Collections.sort(inteiros);
	
	for(int i : inteiros) {
		
		System.out.println(i);
		
		
	}
}

	
	
	
}
