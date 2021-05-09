package ingresso;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);

		System.out.print("DIGITE 1 PARA O INGRESSO NORMAL E 2 PARA VIP:");

		int aux = x.nextInt();

		if (aux == 1) {

			Normal d = new Normal(10);
			d.imprime();

		}
		if (aux == 2) {

			System.out.println("INGRESO DO TIPO VIP");
			System.out.print("DIGITE 1 PARA CAMAROTE SUPERIOR E 2 PARA CAMAROTE INFERIOR:");
			int i = x.nextInt();
			if (i == 1) {
				System.out.println("INGRESO DO TIPO VIP - CAMAROTE SUPERIOR");
				CamaroteSuperior b = new CamaroteSuperior(10, 12, 12);
				System.out.println(b.valorIngressoA());
			}
			if (i == 2) {
				System.out.println("INGRESO DO TIPO VIP - CAMAROTE INFERIOR");
				CamaroteInferior c = new CamaroteInferior(10, 12);
				System.out.println(c.valorIngresso());
			}
			if (i != 1 && i != 2) {
				System.out.println("Número inválido");
			}

		}

		if (aux != 1 && aux != 2) {
			System.out.println("Numero invalido");
		}
	}

}
