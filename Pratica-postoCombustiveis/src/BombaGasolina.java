
public class BombaGasolina extends Bomba {

	// MÉTODO CONSTRUTOR
	public BombaGasolina() {
	}
	public BombaGasolina(double quantidade, double preco, int tipo) {
		double gasolinaComum=5.50;
		double gasolinaAditivada=6.00;
		if (tipo==1) {
			setPreco(gasolinaComum);
		} else if (tipo==2){
			setPreco(gasolinaAditivada);
		} else {
			System.out.println("Dados Incorretos");
		}
		setQuantidade(quantidade);
		setLitrosVendidos(quantidade);
			
	}
	public String toString() {
		return "**** Abastecimento com Gasolina **** \n"+ super.toString()
				+"\nTOTAL = "+faturamento();
	}

}
