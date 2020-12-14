
public class Reveil extends Montre {
	protected int heure,minute;
	protected boolean statut;
	protected Declencheur[] declencheurs;

	public Reveil() {
		super();
	}
	
	public Reveil(int heure, int minute) {	
		this.reglerReveil(heure,minute);
		this.setDeclencheurs();
	}
	
	//Regler le reveil avec une h:m:s lui donne par défaut l'etat allumé
	public void reglerReveil(int heure, int minute) {
		this.setHeure(heure);
		this.setMinute(minute);
		this.setState(true);		
	}
	
	public void definirStatutReveil(boolean newstate) {
		this.setState(newstate);
	}
	
	public void incrementer() {
		super.incrementer();
		if(statut == true) {
			if(super.getHeure() == this.getHeure() && super.getMinute() == this.getMinute() && super.getSeconde() == 0)
				declencher();
		
		}
		
			
	}
	
	public void declencher() {
		for(Declencheur declencheur : declencheurs) {
			if (declencheur.isState() == true) {
				declencheur.declencher();
			}
			
		}
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

	public boolean isState() {
		return statut;
	}

	public void setState(boolean state) {
		this.statut = state;
	}
	
	public Declencheur[] getDeclencheurs() {
		return declencheurs;
	}
	
	public void setDeclencheurs() {
		
		SonnerieDeclencheur declencheur0 = new SonnerieDeclencheur();
		CafetiereDeclencheur declencheur1 = new CafetiereDeclencheur();
		RadioDeclencheur declencheur2 = new RadioDeclencheur();
		
		Declencheur[] tousLesDeclencheurs = new Declencheur[] {declencheur0, declencheur1, declencheur2};
		this.declencheurs = tousLesDeclencheurs;
	}

	
	
}
