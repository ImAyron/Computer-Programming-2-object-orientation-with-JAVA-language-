package empregado;

public class Main {
public static void main(String[] args) {
	
	Empregado n=new Empregado("Ayron",1090);
	Empregado n1=new Empregado("Ayron",1090);
	Empregado n31=new Empregado("Ayron",1090);
	n1.setHorastrab(3);
	n.printInfor();
	n.promocao(2);
	n.printInfor();
	n.gratificacao(160);
	n.printInfor();
	n1.gratificacao(1000);
	n1.printInfor();
	System.out.println("N�mero de empregados inst�nciados:"+Empregado.contadorDeEmpregados);
}
}
