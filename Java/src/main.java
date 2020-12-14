public class main {

	public static void main(String[] args) throws InterruptedException{
		
		SonnerieDeclencheur declencheur1 = new SonnerieDeclencheur();
		CafetiereDeclencheur declencheur2 = new CafetiereDeclencheur();
		RadioDeclencheur declencheur3 = new RadioDeclencheur();
		
		Declencheur[] tousLesDeclencheurs = new Declencheur[] {declencheur1, declencheur2, declencheur3};
		
		Reveil reveil = new Reveil(0,1,tousLesDeclencheurs);
		reveil.tourner();
	}
}

