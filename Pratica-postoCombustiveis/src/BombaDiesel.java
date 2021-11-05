
public class BombaDiesel extends Bomba {

	// MÉTODO CONSTTRUTOR
	public BombaDiesel() {
	}
	public BombaDiesel(int quantidade, double preco, int tipo) {
		double S10=4.50;
		double S20=4.75;
		double S500=5.00;
		double S1800=5.25;
		if (tipo==1) {
			setPreco(S10);
		} else if (tipo==2){
			setPreco(S20);
		} else if (tipo==3) {
			setPreco(S500);;
		} else if (tipo==4) {
			setPreco(S1800);
		}else {
			System.out.println("Dados Incorretos");
		}
		setQuantidade(quantidade);
		setLitrosVendidos(quantidade);
	}
	public String toString() {
		return "**** Abastecimento com Diesel **** \n"+ super.toString()
				+"\nTOTAL = "+faturamento();
	}

}
