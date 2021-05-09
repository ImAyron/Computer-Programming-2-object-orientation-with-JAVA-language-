package questao9;

import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		try {
			someMethod();
		} catch (Exception e) {

			System.out.println("BUGOU !!!!");
			e.printStackTrace();
			System.out.println("ERRO:" + e.getMessage());

		}

	}

	public static void someMethod() throws Exception {

		someMethod2();

	}

	public static void someMethod2() throws Exception {

		FileInputStream file = new FileInputStream("asdhghdashgkds");
		file.close();

	}

}