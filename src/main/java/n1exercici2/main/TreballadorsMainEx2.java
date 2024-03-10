package n1exercici2.main;

import n1exercici2.beans.TreballadorOnline;
import n1exercici2.beans.TreballadorPresencial;

public class TreballadorsMainEx2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		TreballadorPresencial treballador1Presencial = new TreballadorPresencial("Joan", "López", 20);
		TreballadorOnline treballador1Online = new TreballadorOnline("Olga", "Pons", 18);
		
		treballador1Presencial.calcularSou(160);
		treballador1Online.calcularSou(160);
		
		
		treballador1Presencial.calcularComissions(10000);
		
		treballador1Online.bonificarFacturaLlum(110);

	}

}
