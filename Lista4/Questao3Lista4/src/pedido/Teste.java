package pedido;

public class Teste {

	public static void main(String[] args) {

		Produto feijao = new Produto(2, 19.30, "graes de feijao");
		Produto arroz = new Produto(1, 10.80, "Semente com carboidrato");
		ItemPedido pedido1 = new ItemPedido(2, arroz);
		ItemPedido pedido2 = new ItemPedido(3, feijao);
		Pedido p2 = new Pedido();

		p2.adicionar_item(pedido1);
		p2.adicionar_item(pedido2);
		System.out.println(p2.obter_total());

	}

}
