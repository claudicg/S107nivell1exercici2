package n1exercici2.beans;

public abstract class Treballador {

	String nom;
	String cognom;
	int preuHora;
	
	
	public Treballador(String nom, String cognom, int preuHora) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public int getPreuHora() {
		return preuHora;
	}
	public void setPreuHora(int preuHora) {
		this.preuHora = preuHora;
	}
	
	public abstract int calcularSou(int horesTreballades);
}
