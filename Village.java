package personnages;
public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois villageois [];

	public Village(String nom, int nbVillagoisMaximum) {
		this.nom = nom;
		this.villageois=new Gaulois [nbVillagoisMaximum];
	}
	
	public void  ajouterHabitant(Gaulois villageoi) {
		villageois[nbVillageois]=villageoi;
		nbVillageois++;
	}
public Gaulois trouverHabitant (int numVillageois ) {
	return villageois[numVillageois];
}
	public String getNom() {
		return nom;
	}
 public void getChef(Chef chef) {
	this.chef = chef;
}
 public void afficherVillaeois(Village village) {
	 System.out.println("dans "+ village.nom +" du chef "+ village.chef+" vivent les les legendaires gaulois : ");
	 for (int i=0;i<nbVillageois;i++) {
		 System.out.println("- " + villageois[i].getNom());
	 }
	 
 }
 public static void main(String[] args) {
	 Village village = new Village("Village des irreductibles",30);
	// Gaulois gaulois = village.trouverHabitant(30); psq on a depasser le nomre d'indice 
	 Chef chef = new Chef("Abraracourcix",6,village) ;
	 Gaulois asterix =new Gaulois("asterix",8);
	 village.ajouterHabitant(asterix);
	 //Gaulois gaulois = village.trouverHabitant(1);
	// System.out.println(gaulois);
	 village.afficherVillaeois(village);
	 
 }
	
}
