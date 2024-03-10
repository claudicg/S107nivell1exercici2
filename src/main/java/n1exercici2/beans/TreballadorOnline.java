package n1exercici2.beans;

public class TreballadorOnline extends Treballador{
	
	private static final int TARIFA_PLANA_INTERNET = 50;

	public TreballadorOnline(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
		
	}

	@Override
	public int calcularSou(int horesTreballades) {
		
		int souFinal = (horesTreballades * super.preuHora) + TARIFA_PLANA_INTERNET;
		
		return souFinal;
	}
	
	@Deprecated
	//@SuppressWarnings(value = { "" }) 
	public int bonificarFacturaLlum(int facturaLlum) {
		
		int bonificacio = (facturaLlum * 10) / 100;
		
		return bonificacio;
	}
}
