package pedido;

import java.util.ArrayList;

public class Pedido {

	private double valorTotal = 0;
	private ArrayList<ItemPedido> p1 = new ArrayList<>();

	public ArrayList<ItemPedido> getP1() {
		return p1;
	}

	public void setP1(ArrayList<ItemPedido> p1) {
		this.p1 = p1;
	}

	public void adicionar_item(ItemPedido a) {

		p1.add(a);

	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double obter_total() {
		for (ItemPedido p3 : p1)
			this.valorTotal = valorTotal + (p3.getQuantidade() * p3.getProd().getValor());

		return this.valorTotal;
	}

}
