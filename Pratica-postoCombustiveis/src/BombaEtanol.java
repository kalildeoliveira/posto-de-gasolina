
public class BombaEtanol extends Bomba {

	// MÉTODO CONSTRUTOR
	public BombaEtanol() {
	}
	public BombaEtanol(int quantidade, double preco, int fonte) {
		double canaDeAcucar=3.50;
		double milho=3.70;
		if (fonte==1) {
			setPreco(canaDeAcucar);
		} else if (fonte==2){
			setPreco(milho);
		} else {
			System.out.println("Dados Incorretos");
		}
		setQuantidade(quantidade);
		setLitrosVendidos(quantidade);
	}
	public String toString() {
		return "**** Abastecimento com Etanol *****  \n"+ super.toString()
				+"\nTOTAL = "+faturamento();
	}
}
