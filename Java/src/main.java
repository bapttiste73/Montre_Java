import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) throws InterruptedException{
		Montre montre = new Montre();
		montre.tourner();
		/*Compteur seconde = new Compteur(0,60,1);
		int i=1;
		while (i < 100) {
			TimeUnit.SECONDS.sleep(1);
			seconde.incrementer();
			System.out.println(seconde.toString());
			i++;
		}*/
	}
}

