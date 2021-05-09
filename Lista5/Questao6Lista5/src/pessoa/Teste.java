package pessoa;

public class Teste {

	public static void main(String[] args) {

		Rica a = new Rica("Ayron", 18, 30000);

		System.out.println(a.getDinheiro());

		a.fazCompras(400);

		System.out.println(a.getDinheiro());

		Pobre b = new Pobre("Ayron", 18);
		b.trabalha();

		System.out.println(b.getDinheiro());

		Miseravel c = new Miseravel("Ayron", 18);
		c.esmola(1.5);

		System.out.println(c.getDinheiro());

	}

}
