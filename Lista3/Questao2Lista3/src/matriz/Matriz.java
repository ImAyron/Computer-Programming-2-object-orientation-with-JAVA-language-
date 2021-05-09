package matriz;

import java.util.Scanner;

public class Matriz {

	public int linhas;
	public int colunas;
	public int matriz[][] = new int[linhas][colunas];;

	public Matriz(int linhas, int colunas) {
		super();
		this.linhas = linhas;
		this.colunas = colunas;
		this.matriz = new int[this.linhas][this.colunas];

	}

	public void preencheMatriz() {

		for (int i = 0; i < this.linhas; i++) {

			for (int j = 0; j < this.colunas; j++) {
				Scanner x = new Scanner(System.in);

				System.out.println("Digite o valor na posição [" + (i + 1) + "]" + "[" + (j + 1) + "]:");

				this.matriz[i][j] = x.nextInt();

			}

		}

	}

	public void imprimeMatriz() {

		System.out.println("-------------MATRIZ-------------- ");
		for (int i = 0; i < this.linhas; i++) {

			for (int j = 0; j < this.colunas; j++) {

				System.out.print(this.matriz[i][j] + "|");

			}
			System.out.println();

		}

	}

	public void alterarPosicao() {

		System.out.println("Qual posicao deseja alterar:");
		Scanner x = new Scanner(System.in);

		System.out.println("Linha:");
		int linha = x.nextInt();
		System.out.println("Coluna:");
		int coluna = x.nextInt();
		System.out.println("Valor:");
		this.matriz[linha - 1][coluna - 1] = x.nextInt();

	}

	public void transposta() {

		if (this.linhas == this.colunas) {

			for (int i = 0; i < this.linhas; i++) {

				for (int j = 0; j < this.colunas; j++) {

					this.matriz[i][j] = this.matriz[j][i];

				}

				System.out.println();

			}
		} else {

			System.out.println("Não é uma matriz quadrada");

		}

	}

	public void numLinhas() {

		System.out.println("Numero de linhas:" + this.linhas);

	}

	public void numColunas() {

		System.out.println("Numero de colunas:" + this.colunas);

	}

}
