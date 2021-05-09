package pedido;

public class ItemPedido {

	private int quantidade;
	private Produto prod;

	public ItemPedido(int quantidade, Produto prod) {
		super();
		this.quantidade = quantidade;
		this.prod = prod;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

}
