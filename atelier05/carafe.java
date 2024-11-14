package atelier05;

public class carafe {
	private int contenu_, capacite_;
	
	/** création d'une carafe vide
	 * @param capacite - capacité en L de la carafe
	 */
	
	public carafe(int capacite) {
		this.capacite_ = capacite;
		Vider();
	}
	
	public void Remplir() {
		this.contenu_ = capacite_;
	}
	
	public void Vider() {
		this.contenu_ = 0;
	}
	
	public void Contenu() {
		
	}
	
	public void Capacité() {
		
	}
	
	public void Transvaser() {
		this.contenu_ = contenu_ - capacite_;
	}
	
}
