package n1exercici2.beans;

public class TreballadorPresencial extends Treballador{
	
	private static int BENZINA = 200;

	public TreballadorPresencial(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
		
	}

	@Override
	public int calcularSou(int horesTreballades) {
		
		int souFinal = (horesTreballades * super.preuHora) + BENZINA;
		
		return souFinal;
		
	}
	
	@Deprecated
	public int calcularComissions(int beneficis) {
		
		int comissio = (beneficis * 10) / 100;
		
		return comissio;
	}
}
