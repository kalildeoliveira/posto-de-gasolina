public class Bomba {

	// PAR�METROS
	private double quantidade=0;
	private double preco=0;
	private double litrosVendidos=0;

	// M�TODO CONSTRUTOR
	public Bomba() {
	}

	// M�TODOS GETS E SETS
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

	// M�TODOS EXTRAS COM GETS E SETS
	private double valorParaLitros(double valor) {
		return valor;
	}

	public boolean abastecerPorLitro(double litros) {
		return true;
	}

	public boolean abastecerPorValor(double valor) {
		return true;
	}

	public double faturamento() {
		return 0;
	}

	// M�TODO TO STRING 
	public String toString() {
		return "Bomba [quantidade=" + quantidade + ", preco=" + preco
				+ ", litrosVendidos=" + litrosVendidos + "]";
	}
}
