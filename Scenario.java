package personnages;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Druide panaromix = new Druide("Panaromix", 5, 10);
		panaromix.parler("Je vais aller préparer une petite potion...");
		panaromix.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 25);
		panaromix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(6);
		asterix.parler("Bonjour»");
		Romain Minus = new Romain("Minus", 6);
		Minus.parler(" UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(Minus);
		} while (Minus.getForce() == 0);

	}

}
