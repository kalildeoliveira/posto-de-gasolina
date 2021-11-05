public class Bomba {

	// PARÂMETROS
	private double quantidade=0;
	private double preco=0;
	private double litrosVendidos=0;
	private double total=0;

	// MÉTODO CONSTRUTOR
	public Bomba() {
	}

	// MÉTODOS GETS E SETS
	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getLitrosVendidos() {
		return litrosVendidos;
	}

	public void setLitrosVendidos(double litrosVendidos) {
		this.litrosVendidos = litrosVendidos;
	}

	// MÉTODOS EXTRAS 
//	private double valorParaLitros(double valor) {
//		return valor;
//	}
//
//	public boolean abastecerPorLitro(double litros) {
//		return true;
//	}
//
//	public boolean abastecerPorValor(double valor) {
//		return true;
//	}

	public double faturamento() {
		double quantidadeLitros=getQuantidade();
		double precoCombustivel = getPreco();
		double total = quantidadeLitros*precoCombustivel;		
		return total;
	}


	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	// MÉTODO TO STRING 
		public String toString() {
			return "Quantidade=" + quantidade 
					+ ",\n Preco=" + preco
					+ ",\n Litros Vendidos=" + litrosVendidos;
		}
}
