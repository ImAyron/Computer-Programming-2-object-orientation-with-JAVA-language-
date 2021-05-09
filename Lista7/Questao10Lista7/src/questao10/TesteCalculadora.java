package questao10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {

		Calculator a = new Calculator();
		Scanner x = new Scanner(System.in);

		System.out.println("DIGITE 1 PARA DIVISÃO E 2 PARA LOGARITMO");

		int operacao = x.nextInt();
		if (operacao == 1) {
			try {
				System.out.println("Digite o primeiro numero da divisao:");
				int n1 = x.nextInt();
				System.out.println("Digite o segundo numero da divisao:");
				int n2 = x.nextInt();
				double result = a.div(n1, n2);
			} catch (InvalidOperationException e) {
				System.out.println("ERRO");
				e.printStackTrace();
				e.getMessage();
			}
			catch(Exception e) {
				System.out.println("ERRO");
				e.getMessage();
				e.printStackTrace();
				
				
			}

		} else if (operacao == 2) {
			
			System.out.println("Digite o logaritmando:");
			try {
			int n1 = x.nextInt();

			System.out.println("Resultado Logaritmo:" + a.log10(n1));
			
			}catch(Exception e) {
				System.out.println("ERRO");
				e.printStackTrace();
				e.getMessage();
				
			}
		}

	}
}
