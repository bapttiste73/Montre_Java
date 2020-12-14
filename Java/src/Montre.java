
public class Montre extends ChaineCompteur{
	public Montre() {
		Compteur heure = new Compteur(0,24,1);
		Compteur minute = new Compteur(0,60,1);
		Compteur seconde = new Compteur(0,60,1);
		this.compteurs = new Compteur[] {heure,minute,seconde};
	}
	
	public void reglerMontre(Compteur seconde,Compteur minute, Compteur heure ) {
		this.compteurs = new Compteur[] {heure,minute,seconde};
	}
	
	public void tourner() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.incrementer();
			this.afficher();
		}
	}
	
	public int getHeure() {
		return this.compteurs[0].getVal();
	}
	public int getMinute() {
		return this.compteurs[1].getVal();
	}
	public int getSeconde() {
		return this.compteurs[2].getVal();
	}
	
	
	public void afficher() {
		System.out.println(this.toString());
	}
	
}
