
public class Reveil extends Montre{
	protected int heure,minute,seconde;
	protected boolean state;

	public Reveil() {
		super();
	}
	
	public Reveil(int heure, int minute, int seconde) {	
		
		this.reglerReveil(heure,minute,seconde);
	}
	
	//Regler le reveil avec une h:m:s lui donne par défaut l'etat allumé
	public void reglerReveil(int heure, int minute, int seconde) {
		this.setHeure(heure);
		this.setMinute(minute);
		this.setSeconde(seconde);
		this.setState(state);		
	}
	
	public void desactiverReveil() {
		this.setState(false);
	}
	
	public int getHeure() {
		return heure;
	}
	
	public void setHeure(int heure) {
		this.heure = heure;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSeconde() {
		return seconde;
	}

	public void setSeconde(int seconde) {
		this.seconde = seconde;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
}
