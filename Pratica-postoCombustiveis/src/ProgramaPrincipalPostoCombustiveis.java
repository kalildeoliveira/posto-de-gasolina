
public class ProgramaPrincipalPostoCombustiveis {
	
	public static void main(String[] args) {
		// TESTE COM GASOLINA
		BombaGasolina bg = new BombaGasolina(10, 0, 1);
		System.out.println(bg);
		
		// TESTE COM DIESEL
		BombaDiesel bd = new BombaDiesel(9, 0, 2);
		System.out.println(bd);

	}

}
