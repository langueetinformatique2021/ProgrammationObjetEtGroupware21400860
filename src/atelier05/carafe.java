package atelier05;

public class carafe {
	private int contenu_, capacite_;

	
	public carafe(int capacite) {
		this.capacite_ = capacite;
		Vider();
		/** création d'une carafe vide
		 * @param capacite - capacité en L de la carafe */
	}
	
	public void Remplir() {
		this.contenu_ = capacite_;
		/** remplir une carafe pleine */
	}
	
	public void Vider() {
		this.contenu_ = 0;
		/** vider complètement une carafe */
	}
	
	public int Contenu() {
		return this.contenu_;
		/** accesseur en lecture
		 * @return contenu de la carafe en L */
	}
	
	private void Contenu(int contenu) {
		this.contenu_ = contenu;
		/** accesseur en écriture privé
		 * @contenu de la carafe en L à modifier */
	}
	
	
	
	public int Capacité() {
		return this.capacite_;
		/** accesseur en lecture
		 * @return capacité de la carafe en L */
	}

	public void Transvaser(carafe c) {
		int reste = this.capacite_ - this.contenu_;
		System.out.println("reste : " + reste);
		if (c.Contenu() <= reste) { // si le contenu est inf à reste, on peut vider entièrement la carafe c
			this.contenu_ += c.contenu_;
			c.Vider();
		}
		else {
			c.Contenu(c.Contenu() - reste);
			this.Remplir();
		}
	/** transvaser la carafe c dans la carafe this ou inversement
	 * @param c carafe à transvaser */
	}

}
