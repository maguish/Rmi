package common;

import java.io.Serializable;

public class Espece implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nomEspece;
	private int dureeVie;
	
	
	//CONSTRUCTEUR PAR DEFAUT
	public Espece () {
	   }
	
	
	//CONSTRUCTEUR AVEC TOUS LES PARAMETRES
	public Espece (String nomEspece,int dureeVie) {
		this.nomEspece = nomEspece ;
		this.dureeVie = dureeVie;
	   }
	
	
	
	//POUR AFFICHER L'ESPECE DE L'ANIMAL
	public String getEspece() {
		return "L'animal est un(e) " + this.nomEspece + " et sa dur�e de vie est de " + this.dureeVie + " an(s).";
	}
	
	
	
	//LES ACCESSEURS POUR LE NOM DE L'ESPECE
	public String getNomEspece() {
		return this.nomEspece;
	}
	
	public void setNomEspece(String nomEspece) {
		this.nomEspece = nomEspece ;
	}
	
	
	
	//LES ACCESSEURS POUR LA DUREE DE VIE DE L'ESPECE
	public int getDureeVieEspece() {
		return this.dureeVie ;
	}
	
	public void setDureeVie(int dureeVie) {
		this.dureeVie = dureeVie ;
	}

}
