package atelier05;

public class carafe {
	private int contenu_, capacite_;
	
	/** création d'une carafe vide
	 * @param capacite - capacité en L de la carafe */
	
	public carafe(int capacite) {
		this.capacite_ = capacite;
		Vider();
	}
	
	public void Remplir() {
		this.contenu_ = capacite_;
	}
	
	/** remplir une carafe pleine */
	
	public void Vider() {
		this.contenu_ = 0;
	}
	
	/** vider complètement une carafe */
	
	public int Contenu() {
		return this.contenu_;
	}
	
	/** accesseur en lecture
	 * @return contenu de la carafe en L */
	
	public int Capacité() {
		return this.capacite_;
	}
	
	/** accesseur en lecture
	 * @return capacité de la carafe en L */
	
	public void Transvaser() {
		this.contenu_ = contenu_ - capacite_;
	}
	
}
