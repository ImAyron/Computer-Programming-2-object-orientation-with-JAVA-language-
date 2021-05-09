package questao5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		boolean loop=true;
		System.out.println("Eu sei dividir!");
		
		while(loop) {
		try {
		System.out.println("Informe o primeiro valor:");
		int x=teclado.nextInt();
		
		System.out.println("Informe o segundo valor:");
		int y=teclado.nextInt();
		
		double r=(x/y);
		
		System.out.println("O resultado da divisão é " + r);
		
		loop=false;
	
		}catch (InputMismatchException e) {
			System.out.println("NÃO PODEMOS DIVIDIR LETRAS KKKKK");
			
		}catch(ArithmeticException e) {
			System.out.println("NÃO PODEMOS DIVIDIR POR 0");
			
		}catch(Exception e) {
			
			System.out.println("Erro inesperado");
			
		}
		
		
	}
	}

}
