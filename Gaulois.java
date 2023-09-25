package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	public Gaulois(String nom, int force) {
	this.nom = nom;
	this.force = force;
	}
	public String getNom() {
	return nom;
	}
	public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
	return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
	System.out.println(nom + " envoie un grand coup dans la mâchoire de "
	+ romain.getNom());
	romain.recevoirCoup((force / 3)*effetPotion);
	}
	
	/*public String toString() {
	return "Gaulois [nom=" + nom + ", force=" + force
	+ ", effetPotion=" + effetPotion + "]";
	}*/
	public void boirePotion(int f) {
		
		effetPotion=f*10*effetPotion; {
		parler("merci druide je sens que ma force est "+ f +" fois décuplée.");}
	}
	public static void main(String[] args) {
	//TODO créer un main permettant de tester la classe Gaulois
		Gaulois asterix = new Gaulois ("Asterix",8); 
		// System.out.println(asterix.parler("salut"));
		 System.out.println(asterix.prendreParole());
		 
	} 
	}



