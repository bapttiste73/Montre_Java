
public class ChaineCompteur {

	protected Compteur[] compteurs;
	
	public ChaineCompteur() {}
	
	public ChaineCompteur(Compteur[] tabCompteur) {
		this.compteurs = tabCompteur;
	}

	public Compteur[] getTabCompteur() {
		return compteurs;
	}
	
	public void incrementer() {
		int i = this.getTabCompteur().length - 1;
		compteurs[i].incrementer(); 
		if(compteurs[i].fini()) {
			do {
				compteurs[i].RAZ();
				if (i-1 >= 0) {	// Test si c'est le dernier compteur
					compteurs[i-1].incrementer();
					i--;
				}else {
					this.RAZ();
				}
			}
			while(compteurs[i].fini());
	
		}
		 
		
	}
	
	public void RAZ() {
		for(Compteur compteur : compteurs) {
			compteur.RAZ();
		}
	}
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < compteurs.length; i++) {
			str += compteurs[i].toString();
			if(i+1 != compteurs.length)
				str += ":";
		}
		return str;
	}
}
