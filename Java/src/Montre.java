
public class Montre extends ChaineCompteur{
	public Montre() {
		Compteur heure = new Compteur(0,2,1);
		Compteur minute = new Compteur(0,10,1);
		Compteur seconde = new Compteur(0,30,1);
		this.compteurs = new Compteur[] {heure,minute,seconde};
	}
	
	public void reglerMontre(Compteur seconde,Compteur minute, Compteur heure ) {
		this.compteurs = new Compteur[] {heure,minute,seconde};
	}
	
	public void tourner() {
		for(int i =0; i<10000; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.incrementer();
			this.afficher();
		}
	}
	
	
	public void afficher() {
		System.out.println(this.toString());
	}
	
}
