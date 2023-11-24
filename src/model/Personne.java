package model;

/******
 * JAXB
 */
public class Personne {
	// Donnees
	private int nni;
	private String nom;

	// Constructeurs
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(int nni, String nom) {
		super();
		this.nni = nni;
		this.nom = nom;
	}

	/*
	 * getters / setters
	 */
	public int getNni() {
		return nni;
	}

	public void setNni(int nni) {
		this.nni = nni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/*********************************************
	 * Affichage
	 */
	@Override
	public String toString() {
		return "Personne [nni=" + nni + ", nom=" + nom + "]";
	}

}
