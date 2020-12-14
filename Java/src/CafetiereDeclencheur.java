
public class CafetiereDeclencheur extends Declencheur implements iCafetiere {
	
	protected Cafetiere cafetiere;

	public CafetiereDeclencheur() {
		this.cafetiere = new Cafetiere();
	}
	
	public void declencher() {
		faireCafe();
	}
	
	public void faireCafe() {
		cafetiere.faireCafe();
	}
	

}
