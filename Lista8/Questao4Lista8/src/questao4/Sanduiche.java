package questao4;

public class Sanduiche {
	private Pao pao;
	private Queijo queijo;
	private Presunto Presunto;
	private String nomeRestaurante;
	private Salada salada;
	
	public Sanduiche(String nomeRestaurante,String pao, String queijo,String Presunto, String salada) {
		this.nomeRestaurante=nomeRestaurante;
		this.pao = PaoFactory.CriarPao(pao);
		this.queijo=QueijoFactory.CriarQueijo(queijo);
		this.Presunto=PresuntoFactory.CriaPresunto(Presunto);
		this.salada=SaladaFactory.CriaSalada(salada);

	}

	public Pao getPao() {
		return pao;
	}
	
	public void ImprimirSanduiche() {
		System.out.println(this.nomeRestaurante);
		pao.imprimir();
		queijo.imprimir();
		Presunto.imprimir();
		salada.imprimir();
		
	}

	public Queijo getQueijo() {
		return queijo;
	}

	public Presunto getPresunto() {
		return Presunto;
	}

	public String getNomeRestaurante() {
		return nomeRestaurante;
	}

}
