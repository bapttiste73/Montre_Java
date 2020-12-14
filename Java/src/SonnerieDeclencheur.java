
public class SonnerieDeclencheur extends Declencheur implements iSonnerie {

	protected Sonnerie sonnerie;
	
	public SonnerieDeclencheur() {
		this.sonnerie = new Sonnerie();
	}
	
	public void declencher() {
		sonner();
	}
	
	public void sonner() {
		sonnerie.sonner();
	}
	
}
