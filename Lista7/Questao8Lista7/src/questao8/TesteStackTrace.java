package questao8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteStackTrace {
	
	
	public static void divisaoErro() {
		
		Scanner x=new Scanner (System.in);
		
		
		System.out.println("Digite um número:");
		try {
		int a=x.nextInt();
		System.out.println("Digite outro número:");
		int b=x.nextInt();
		int result=a/b;
		
		System.out.println(result);
		}catch(InputMismatchException e) {
			System.out.println("NÃO É NUMERO");
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		
		try {
		divisaoErro();
		}catch(ArithmeticException e) {
			System.out.println("DIVISAO POR ZERO");
			e.printStackTrace();
		}catch(Exception e) {
			
			System.out.println("OUTRO ERRO");
			
		}
	}
}
